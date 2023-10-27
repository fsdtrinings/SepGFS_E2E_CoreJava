package com.cg.bookstore.service;

import com.cg.bookstore.entities.Category;

public interface ICategoryService {

	public Category addCategory(String categoryName);
	public Category editCategory(Category cat);
	public Category viewAllCategories();
	public Category removeCategory(Category cat);
}
