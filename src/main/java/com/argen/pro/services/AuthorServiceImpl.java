package com.argen.pro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.argen.pro.models.Author;
import com.argen.pro.repositories.IAuthorRepository;

@Service
public class AuthorServiceImpl implements IAuthorService {

	@Autowired
	private IAuthorRepository authorRepository;

	@Override
	public void saveAuthor(Author autor) {
		authorRepository.save(autor);

	}

	@Override
	public List<Author> getAllAuthors() {
		return authorRepository.findAll();

	}

	@Override
	public Author getAuthorById(Integer id) {
		return authorRepository.findById(id).orElse(null);
	}

	@Override
	public void updateAuthor(Author autor) {
		this.saveAuthor(autor);

	}

	@Override
	public void deleteAuthor(Integer id) {
		authorRepository.deleteById(id);

	}

}
