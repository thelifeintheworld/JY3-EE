package com.test.server;

import com.test.dao.UserDao;
import com.test.dao.UserDaoTmpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RestigerServlet",urlPatterns = "/res.do")
public class RestigerServlet extends HttpServlet {
    private UserDao ud;
    @Override
    public void init() throws ServletException {
        ud = new UserDaoTmpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //request.getRequestDispatcher("s");
    String user = request.getParameter("username");
    String psw = request.getParameter("psw");
//    System.out.println(user+","+psw);
        ud.regsiter(user,psw);
        //跳转界面
    request.getRequestDispatcher("Restiger.jsp").forward(request,response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
    }
}
