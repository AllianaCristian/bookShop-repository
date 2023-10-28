package com.argen.pro.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.argen.pro.models.Author;

@Service 

public interface IAuthorService {
	
    public void saveAuthor(Author autor);
	
	public List<Author> getAllAuthors();
	
	public Author getAuthorById(Integer id);
	
	public void updateAuthor(Author autor);
	
	public void deleteAuthor(Integer id);


}
