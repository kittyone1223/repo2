package com.ujiuye.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ujiuye.entity.Student;
import com.ujiuye.service.StudentService;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/Student")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 处理中文乱码问题
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		// 获取请求的消息
		String sname = request.getParameter("sname");
		String sgender = request.getParameter("sgender");
		String[] shobbys = request.getParameterValues("shobby");
		String hobby ="";
		for (String string : shobbys) {
			hobby+=string+"+";
		}
		
		String shobby = hobby.substring(0, hobby.length()-1);
		
		String sdegree = request.getParameter("sdegree");
		
		String smark = request.getParameter("smark");
		
		StudentService service = new StudentService();
		Student student = new Student(sname,sgender,shobby,sdegree,smark);
		boolean flag = service.isinsertStu(student);
		PrintWriter writer = response.getWriter();
		if(flag) {
			writer.print("<h2 style='color:pink'>注册成功</h2>");
		}else {
			writer.print("<h2 style='color:red'>注册失败</h2>");
		}
	}

}
