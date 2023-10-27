package com.cg.bookstore.repository;

import java.util.List;

import com.cg.bookstore.entities.Book;
import com.cg.bookstore.entities.Customer;
import com.cg.bookstore.entities.Review;

public interface IReviewRepository {

	public List<Review> listAllReviews();
	public Review addReview(Review review);
	public Review deleteReview(Review review);
	public Review updateReview(Review review);
	public Review viewReview(Review review);
	public List<Review> listAllReviewsByBook(Book book);
	public List<Review> listAllReviewsByCustomer(Customer c);
	public List<Book> listMostFavoredBooks();
}
