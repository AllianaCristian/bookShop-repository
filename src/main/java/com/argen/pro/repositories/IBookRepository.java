package com.argen.pro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.argen.pro.models.Book;

public interface IBookRepository extends JpaRepository<Book, Integer> {

}
