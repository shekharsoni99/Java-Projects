package com.resturant_LLD;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

enum ReservationStatus{CONFIRMED, CANCELLED, PENDING, REQUESTED, ABONDONED, CHECKED_IN};
enum SeatType{REGULAR, KID, ACCESSIBLE};
enum TableStatus{AVAILABLE, RESERVED, OCCUPIED, IN_MAINTENCE};
enum PaymentStatus{PAID, PENDING};
enum PaymentMethod{CC, DC, UPI, CASH};


abstract class Person {
	private String name;
	private String phone;
}

class Address {
	String city;
	String zip;
}

abstract class Employee extends Person {
	int empId;
	String department;
	
	//setters, getters and constructors
}

class Chef extends Employee {
	
	MenuItem takeOrder(MenuItem item) {
		queueOrder(item);
		return cook(item);
	}
	
	void queueOrder(MenuItem item) {
		Queue<MenuItem> orderQueue = new LinkedList<>();
		orderQueue.add(item);
		
		//JDBC, Hibernate, db, etc..
	}
	
	MenuItem cook(MenuItem item) {
		return new MenuItem();
	}
}

class Manager extends Employee {
	public boolean addEmployee(Employee employee) {
		return false;
	}
}

class Kitchen {
	String name;
	List<Chef> chefList;
	
	//Queue<Order>
}

class Branch {
	String name;
	Address branchAddress;
	List<Employee> employees;
	Kitchen kitchen;
	
	//Menu
}

class Resturent {
	String name;
	List<Branch> branches;
	
	boolean addBranch(Branch branch) {
		branches.add(branch);
		return true;
	}
	
	boolean removeBranch(Branch branch) {
		branches.remove(branch);
		return true;
	}
	
	boolean shut() {
		branches.clear();
		return true;
	}
}

class Seat{
	int tableNumber;
	SeatType seatType;
	
	SeatType updateSeatType() {
		return null;
	}
}

class Table {
	TableStatus tableStatus;
	int tableNumber;
	int tableCapacity;
	List<Seat> seats;
	
	boolean isAvailable() {
		return (tableStatus == TableStatus.AVAILABLE);
	}
}

class Reservation {
	ReservationStatus reservationStatus;
	int reservationId;
	Date reservationTime;
	int peopleCount;
	Date checkInTime;
	Customer customer;
	Table[] tables;
	
	boolean rescheduleCheckInTime() {
		return true;
	}
	
	boolean updatePeopleCount() {
		return true;
	}
	
	boolean cancelReservation (Reservation reservation) {
		reservation.reservationStatus = ReservationStatus.CANCELLED;
		for(Table table:tables) {
			table.tableStatus = TableStatus.AVAILABLE;
		}
		return true;
	}
	
	boolean cancelReservation(int reservationID) {
		//pull it from database
		return false;
	}
}

class Customer {}

class Menu {
	int MenuId;
	String title;
	
	boolean addMenuSection() {
		return true;
	}
	
	private List<MenuSection> menuSection;
}

class MenuSection {
	List<MenuItem> menuItems;
}

class MenuItem {
	Double price;
	String itemName;
	int menuItemId;
	String description;
	ItemType itemType;
	String picture;
	Double rating;
	
	boolean updatePrice(Double newPrice) {
		price = newPrice;
		return true;
	}
}

enum ItemType{VEG, NONVEG, VEGAN}

class Order {
	int orderId;
	OrderStatus orderStatus;
	List<MenuItem> menuItems;
	Waiter waiter;
	Chef chef;
	Table table;
	Double bill;

	//Map<MenuItems, Integer> menuItemWithCount;
}

class Waiter extends Employee {
	List<Order> orders;
	void takeOrder(Order order) {
		orders.add(order);
	}
	
	void serveOrder(Order order) {
		order.orderStatus = OrderStatus.SERVED;
		orders.remove(order);
	}
}

enum OrderStatus {COMPLETED, PLACED, SERVED}