package com.sugi.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");

		request.getSession().setAttribute("firstname", firstname);
		request.getSession().setAttribute("lastname", lastname);
		request.getSession().setAttribute("gender", gender);
		request.getSession().setAttribute("dob", dob);
		request.getSession().setAttribute("address", address);
		request.getSession().setAttribute("email", email);
		request.getSession().setAttribute("phone", phone);

		response.sendRedirect("printout.jsp");
	}

	public int addTest(int a, int b) {

		System.out.println("This method will perform Addition");

		return a + b;

	}

	public int subTest(int a, int b) {

		System.out.println("This method will perform Subtraction");

		return a - b;

	}

}
