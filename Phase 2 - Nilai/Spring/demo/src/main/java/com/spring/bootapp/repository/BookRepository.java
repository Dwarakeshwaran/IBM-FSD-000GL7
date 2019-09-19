package com.spring.bootapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.bootapp.model.Book;

@Repository 
public interface BookRepository extends CrudRepository<Book, Long> {

}
