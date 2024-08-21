package com.kuntze.struts.actions;

import com.opensymphony.xwork2.ActionSupport;

public class ActionTest extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	@Override
	public String execute() {
		System.out.println("actionTest() method invoked");
		setMessage("Success message for testing data biding");
		return SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}