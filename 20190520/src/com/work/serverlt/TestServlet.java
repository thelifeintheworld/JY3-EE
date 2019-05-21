package com.work.serverlt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//

@WebServlet(name = "TestServlet",urlPatterns = "/test.do")
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html;charset=utf-8");
//        int a= 100;
//        PrintWriter pw = response.getWriter();
//        pw.write("<div><h1>嘻嘻");
//        pw.write(a+"</h1></div>");
//
//        Date d = new Date();
//        java.sql.Date date = new java.sql.Date(1234567890l);

        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("带鱼");
        list.add("排骨");
        list.add("乌贼");




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
    }
}
