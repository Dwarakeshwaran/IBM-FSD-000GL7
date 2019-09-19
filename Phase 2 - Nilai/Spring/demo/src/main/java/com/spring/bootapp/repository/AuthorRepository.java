package com.spring.bootapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.bootapp.model.Author;

@Repository 
public interface AuthorRepository extends CrudRepository<Author, Long> {

}