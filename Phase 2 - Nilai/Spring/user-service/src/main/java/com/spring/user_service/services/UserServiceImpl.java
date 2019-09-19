package com.spring.user_service.services;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.user_service.entity.UserEntity;
import com.spring.user_service.repository.UserRepository;
import com.spring.user_service.shared.UserDto;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepo;
	
	
	@Autowired
	public UserServiceImpl(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}



	@Override
	public UserDto createUser(UserDto userDetails) {
		userDetails.setuId(UUID.randomUUID().toString());
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		UserEntity userEntity = mapper.map(userDetails, UserEntity.class);
		userRepo.save(userEntity);
		UserDto uDto=mapper.map(userEntity, UserDto.class);
		return uDto;
	}

}
