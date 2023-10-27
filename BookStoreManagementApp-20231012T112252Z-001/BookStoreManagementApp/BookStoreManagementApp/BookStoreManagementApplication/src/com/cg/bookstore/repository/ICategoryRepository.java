package com.cg.bookstore.repository;

import com.cg.bookstore.entities.Category;

public interface ICategoryRepository {

	public Category addCategory(String categoryName);
	public Category editCategory(Category cat);
	public Category viewAllCategories();
	public Category removeCategory(Category cat);
}
