package com.Payments;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/updatePayment")
public class UpdatePaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//pass data jsp do servlet
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		String accountno = request.getParameter("acc");
		String username = request.getParameter("user");
		String cardno = request.getParameter("cards");
		String cvv = request.getParameter("cvvv");
		String expyear = request.getParameter("expy");
        String cardtype = request.getParameter("cardt");
     
        boolean isTrue;
        
        //call PaymentsDBUtil
	 
        isTrue = PaymentsDBUtil.updatePayment(accountno,username,cardno,cvv,expyear,cardtype);
        
		if(isTrue == true) {
	
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
		}
	 
			
			
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
		
		
	}

 
 