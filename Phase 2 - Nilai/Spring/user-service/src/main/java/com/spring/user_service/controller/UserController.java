package com.spring.user_service.controller;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.user_service.model.CreateUserRequestModel;
import com.spring.user_service.model.CreateUserResponseModel;
import com.spring.user_service.services.UserService;
import com.spring.user_service.shared.UserDto;

@RestController
@RequestMapping("/")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	private String goHome() {
		return "ok";
	}
	
	@PostMapping("/users")
	public ResponseEntity<CreateUserResponseModel> create(@RequestBody CreateUserRequestModel userDetail)
	{
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		UserDto uDto=mapper.map(userDetail, UserDto.class);
		
		UserDto tempDto=userService.createUser(uDto);
		CreateUserResponseModel model=mapper.map(tempDto, CreateUserResponseModel.class);;
		return ResponseEntity.status(HttpStatus.CREATED).body(model);

	}

}