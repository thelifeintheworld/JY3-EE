package com.test.server;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

@WebServlet(name = "UploadServlet",urlPatterns = "/upload.do")
@MultipartConfig
public class UploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Part file1=request.getPart("file1");
    String s = file1.getSubmittedFileName();
//    System.out.println(s);
       InputStream inputStream = file1.getInputStream();
       //创建UUID
        UUID uuid = UUID.randomUUID();
        OutputStream os = new FileOutputStream("F:\\imgs\\"+(uuid+s));
        int buffer=0;
        byte[] bd = new byte[1024];
        while ((inputStream.read(bd))!= -1){
            os.write(bd,0,buffer);
        }
        os.close();
        inputStream.close();
        request.getRequestDispatcher("check.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
    }
}
