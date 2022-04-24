package com.springApp5;

public class PresentationBean {
	
	private ServiceBean service;
	
	public void setService(ServiceBean service) {
		this.service = service;
	}
	
	public void present() {
		service.calculateInterest();
		System.out.println("Presenting the calculated interesest in PL");
	}

}
