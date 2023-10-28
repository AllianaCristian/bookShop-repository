package com.argen.pro.services;

import java.util.List;

import com.argen.pro.models.Book;;

public interface IBookService {
	
public void saveBook(Book book);
	
	public List<Book> getAllBooks();
	
	public Book getBookById(Integer id);
	
	public void updateBook(Book book);
	
	public void deleteBook(Integer id);

}
