package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("以Get方式请求访问...");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		out.println("能!!!");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("以Post方式请求访问...");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		out.println("能个狗屁又是乱码!!!");
	}
  
}
