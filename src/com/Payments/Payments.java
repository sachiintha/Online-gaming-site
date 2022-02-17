package com.Payments;
 
public class Payments{
	
	//variables
	private int accountNo;
	private String userName;
	private String cardNo;
	private String cVV;
	private String expYear;
	private String cardType;
	
	//Create overloaded constructor
	public Payments(int accountNo, String userName, String cardNo, String cVV, String expYear, String cardType) {
		
		this.accountNo = accountNo;
		this.userName = userName;
		this.cardNo = cardNo;
		this.cVV = cVV;
		this.expYear = expYear;
		this.cardType = cardType;
	}
	//call get methods
	
	public int getAccountNo() {
		return accountNo;
	}

	public String getUserName() {
		return userName;
	}

	public String getCardNo() {
		return cardNo;
	}

	public String getcVV() {
		return cVV;
	}

	public String getExpYear() {
		return expYear;
	}

	 
	public String getCardType() {
		return cardType;
	}



	}