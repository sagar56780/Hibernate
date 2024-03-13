package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.DataAcessObject;
import model.dto.Course;
@WebServlet(value="/course")
public class AddCourse extends HttpServlet {
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			DataAcessObject dao=new DataAcessObject();
			String cname=req.getParameter("cname");
			String duration=req.getParameter("duration");
			double fees=Double.parseDouble(req.getParameter("fees"));
		    
			Course c=new Course(cname,fees,duration,null);
			dao.addCourse(c);
			
		
		
			
		
		}
	

}
