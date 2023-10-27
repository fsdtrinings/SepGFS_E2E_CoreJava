package com.cg.bookstore.repository;

import java.util.List;

import com.cg.bookstore.entities.Book;

public interface IBookRepository {

	public Book findByTitle(String title);
	public List<Book> findByCategory(String cat);
	public List<Book> search(String keyword);
	public List<Book> listRecentlyAdded();
}
