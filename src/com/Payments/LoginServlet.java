package com.Payments;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

			protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String accountno = request.getParameter("uid");
		String username = request.getParameter("pass");

		
		
		
		try {
			//call PaymentsDBUtil
			
			List<Payments> cusDetails = PaymentsDBUtil.validate(accountno, username);
			request.setAttribute("cusDetails", cusDetails);
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher dis = request.getRequestDispatcher("PaymentDetails.jsp");
		dis.forward(request, response);

	}

}
