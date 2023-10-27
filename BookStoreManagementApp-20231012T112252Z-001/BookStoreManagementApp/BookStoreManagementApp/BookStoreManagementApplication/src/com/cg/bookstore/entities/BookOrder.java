package com.cg.bookstore.entities;

import java.time.LocalDate;

public class BookOrder {

	private int orderId;
	private Customer customer;
	private LocalDate orderDate;
	private double orderTotal;
	private String status;
	private Address ShippingAddress;
	private String paymentMethod;
	private String recipientName;
	private String recipientPhone;
	
}
