package com.gcj.course.servlet;

import com.gcj.course.service.CoreService;
import com.gcj.course.util.SignUtil;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CoreServlet extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = -7525302406709274220L;

    /**
     * 请求校验(确认请求来自微信服务器)
     *
     * @param request
     * @param response
     * @throws IOException
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 微信加密签名
        String signature = request.getParameter("signature");
        // 时间戳
        String timestamp = request.getParameter("timestamp");
        // 随机数
        String nonce = request.getParameter("nonce");
        // 随机字符串
        String echostr = request.getParameter("echostr");

        PrintWriter out = response.getWriter();

        // 请求校验,若校验成功则原样返回echostr,表示接入成功,否则接入失败
        if (SignUtil.checkSignature(signature, timestamp, nonce)) {
            out.print(echostr);
        }
        out.close();
    }

    /**
     * 处理微信服务器发来的消息
     *
     * @param request
     * @param response
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 将请求、响应的编码均设置为UTF-8（防止中文乱码）
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        // 接收参数微信加密签名、 时间戳、随机数
        String signature = request.getParameter("signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");

        PrintWriter out = response.getWriter();

        if (SignUtil.checkSignature(signature, timestamp, nonce)) {
            String respXml = CoreService.processRequest(request);
            out.print(respXml);
        }
        out.close();
    }
}
