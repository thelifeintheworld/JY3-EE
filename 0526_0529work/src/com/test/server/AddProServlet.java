package com.test.server;

import com.test.dao.ProDao;
import com.test.dao.ProDaoTmpl;
import com.test.pojo.Product;
import com.test.utils.FileAction;
import com.test.utils.Proutil;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;

@WebServlet(name = "AddProServlet",urlPatterns = "/addpro.do")
@MultipartConfig
public class AddProServlet extends HttpServlet {
    private ProDao pd;

    @Override
    public void init() throws ServletException {
        pd = new ProDaoTmpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String sname = request.getParameter("proName");
    String proPrice = request.getParameter("proPrice");
//获得图片
        Part file1 = request.getPart("file1");
       String realname = FileAction.uploadFile(file1);
    String prodes = request.getParameter("prodes");
    String prostock = request.getParameter("prostock");
    String prodate = request.getParameter("prodate");
    String procateid = request.getParameter("procateid");
    String profac = request.getParameter("profac");
        Product product = new Product(Proutil.getProId(),sname,Double.parseDouble(proPrice),realname,prodes,Short.parseShort(prostock),Proutil.stringToDate(prodate),Short.valueOf(procateid),profac);
        pd.addOnePro(product);
        response.sendRedirect("success.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
    }
}
