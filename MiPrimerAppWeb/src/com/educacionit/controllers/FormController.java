package com.educacionit.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormController
 */
@WebServlet("/FormController")
public class FormController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FormController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Te respondio tu request el servlet del applicativo : ")
		.append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String em = request.getParameter("email");
		String un = request.getParameter("uname");
		String pa = request.getParameter("pass");
		String ge = request.getParameter("gender");
		String[] co = request.getParameterValues("course");

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.write("<h1>gracias por enviarnos su formulario </h1>");
		pw.write("<h2>email recibido:" + em + "</h2>");
		pw.write("<h2>nombre recibido:" + un + "</h2>");
		pw.write("<h2>password recibido:" + pa + "</h2>");
		pw.write("<h2>Cursos recibido :");
		for (String curso : co) {
			pw.write(curso + "    ");
		}
		pw.write("</h2>");

		// response.getWriter().append("Te respondio tu request el servlet del
		// applicativo : " ).append(request.getContextPath());
//	doGet(request , response);

	}
}
