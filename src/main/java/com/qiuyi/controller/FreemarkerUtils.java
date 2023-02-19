package com.qiuyi.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * @Author: qiuyi
 * @Description:
 * @DateTime: 2022/12/9 14:27
 **/
@WebServlet("/freemarker")
public class FreemarkerUtils extends HttpServlet {
    HashMap model;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("msg", "Hello FreeMarker");
        req.getRequestDispatcher("template/freemarkerDemo.ftl").forward(req,resp);
    }
}
