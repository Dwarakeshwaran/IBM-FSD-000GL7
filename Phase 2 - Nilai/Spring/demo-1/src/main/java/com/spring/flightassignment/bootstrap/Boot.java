package com.spring.flightassignment.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.spring.flightassignment.entity.Flight;
import com.spring.flightassignment.repository.FlightRepository;
import com.spring.flightassignment.repository.PassengerRepository;

@Component
public class Boot implements ApplicationListener<ContextRefreshedEvent>{

	
	private FlightRepository flightRepo;
	private PassengerRepository passengerRepo;
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}
	
	public void init() {
		
		
		Flight flight = new Flight("Oceanic 815");
		flightRepo.save(flight);
	}

}
 