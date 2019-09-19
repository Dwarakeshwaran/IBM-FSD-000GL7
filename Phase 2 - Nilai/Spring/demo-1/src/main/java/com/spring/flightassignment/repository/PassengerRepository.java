package com.spring.flightassignment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.flightassignment.entity.Passenger;

@Repository
public interface PassengerRepository extends CrudRepository<Passenger, Long> {

}
