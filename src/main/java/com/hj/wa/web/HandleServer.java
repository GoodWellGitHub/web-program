package com.hj.wa.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class HandleServer extends HttpServlet {
    public void init() throws ServletException {
    }

    //handle get request
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        // 首先将访问修饰符覆写为public
        // 设置内容类型
        response.setContentType("text/html");


        PrintWriter out = response.getWriter();


        out.println("<html><head><title>Hello World Sample</title></head>");

        out.println("<body><h1>Hello World Title<h1><h2>" + new Date().toLocaleString() + "</h2></body></html>");

        out.flush();


    }

    //handle post request
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    //handle put request

    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    //handle delete request

    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    //destroy

    public void destroy() {
    }
}
