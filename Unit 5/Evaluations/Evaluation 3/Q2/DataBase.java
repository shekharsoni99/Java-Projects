package com.masai_Evaluation3_Q2;

import java.util.List;

enum MemberShip {APPLY, PENDING, ACCEPTED, COMPLETED, ABONDEND, EXTENDED, REJECTED}

class Customer {
	String name;
	int custId;
	String Address;
	String zip;
}

class Books {
	List<Books> books;
}

class DataBase extends Customer{
	
	String nameOfBook;

	public boolean searchBook(String nameOfBook) {
		//Search in database
		return true;
	}
	
	public boolean searchMember(String name) {
		// check if the user is member or not
		return true;
	}
	
	public void read() {
		Read read = new Read();
		read.read(nameOfBook);
	}
	
	public void memberShipExtend() {
		MemberShipExtention memberShipExtention = new MemberShipExtention();
		memberShipExtention.Extention();
	}
	
	public void membershipcreate() {
		MemberShipCreation memberShipCreation = new MemberShipCreation();
		memberShipCreation.apply(name);
	}
}

class MemberShipCreation extends Customer{
	MemberShip memberShip;
	DataBase dataBase;
	
	public MemberShip apply(String name) {
		
		//Store the details in database
		if(dataBase.searchMember(name)) {
			return memberShip.APPLY;
		}
		
		return memberShip.REJECTED;
	}
	
}

class MemberShipExtention  extends Customer {
	MemberShip memberShip;
	
	public MemberShip Extention() {
		
		//update the deatils in database and extend it
		
		return memberShip.EXTENDED;
	}
}


class Read  extends Customer{
	
	DataBase dataBase;
	String nameOfBook;
	MemberShip memberShip;

	public boolean member(String name) {
		//search in  database if the customer has a member ship or not
		
		
		if (dataBase.searchBook(nameOfBook)) {
			read(nameOfBook);
			return true;
		}
		return false;
		
	}
	public void read(String nameOfBook) {
			
		System.out.println("Book is present and Reading..");
	}
}
