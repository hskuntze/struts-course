package com.kuntze.struts.actions;

import com.opensymphony.xwork2.ActionSupport;

public class SubmitFormAction extends ActionSupport{

	private static final long serialVersionUID = 797487195092604246L;

	private String userFirstName;
	private String userLastName;
	
	@Override
	public String execute() throws Exception {
		return "submit";
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
}
