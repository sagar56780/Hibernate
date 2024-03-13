package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.DataAcessObject;
@WebServlet(value="/admin_login")
public class AdminLogin  extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=req.getParameter("id");
		String passowrd=req.getParameter("pwd");
		String admin_name=req.getParameter("admin_name");
		
		DataAcessObject dao=new DataAcessObject();
	boolean result=	dao.admin_login(id, passowrd, admin_name);
		RequestDispatcher rd=req.getRequestDispatcher("admin_operation.jsp");
		PrintWriter pw=resp.getWriter();
		RequestDispatcher rd1=req.getRequestDispatcher("index.jsp");
		if(result)
		{
			req.setAttribute(id, "id");
			rd.forward(req, resp);
			
		}
		else {
			rd1.include(req, resp);
			pw.print("invalid credintials");
		}
		
	}
	

}
