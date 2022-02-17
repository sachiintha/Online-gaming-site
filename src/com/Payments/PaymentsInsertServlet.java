package com.Payments;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/PaymentInsert")
public class PaymentsInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 	 
		 

		String name = request.getParameter("name");
		String cardno = request.getParameter("cardnno");
		String cvV = request.getParameter("cvv");
		String expdate = request.getParameter("exp");
		String cardtyp = request.getParameter("type");
 
		boolean isTrue;

		//call PaymentsDBUtil
		
		isTrue = PaymentsDBUtil.PaymentInsert(name,cardno,cvV,expdate,cardtyp);

		if (isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}

	}
		
		
		
	}


