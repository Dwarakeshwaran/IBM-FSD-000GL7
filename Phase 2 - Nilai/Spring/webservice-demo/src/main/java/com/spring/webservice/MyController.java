package com.spring.webservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {
	
	@Autowired
	private Environment env;
	
	@Value("${lucky-word}")
	private String luckyWord;
	
	private static final Logger logger = LoggerFactory.getLogger(MyController.class);
	
	
	@RequestMapping("/lucky-word")
	public String getLuckyWord() {
		
		logger.info("Config of Luck word! port: "+env.getProperty("local.server.port"));
		
		return "Lucky Word is "+luckyWord;
	}

}
