package com.spring.bootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.bootapp.model.Publisher;

@Repository 
public interface PublisherRepository extends JpaRepository <Publisher, Long> {

}