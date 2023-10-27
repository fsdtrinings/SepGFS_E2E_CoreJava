package com.cg.bookstore.entities;

import java.time.LocalDate;

public class Review {

	private int reviewId;
	private Book book;
	private Customer customer;
	private String headLine;
	private String comment;
	private double rating;
	private LocalDate reviewOn;
	
}
