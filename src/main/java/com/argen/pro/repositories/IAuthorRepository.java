package com.argen.pro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.argen.pro.models.Author;

@Repository

public interface IAuthorRepository extends JpaRepository<Author ,Integer>{
	
	

}
