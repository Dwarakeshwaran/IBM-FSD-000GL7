package com.spring.flightassignment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.flightassignment.entity.Flight;


@Repository
public interface FlightRepository extends CrudRepository<Flight, Long>{

}
