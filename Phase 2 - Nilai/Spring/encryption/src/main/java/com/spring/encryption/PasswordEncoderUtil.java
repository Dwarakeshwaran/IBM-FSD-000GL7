package com.spring.encryption;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderUtil {
	public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encoded = encoder.encode("test123");//bob's password
        System.out.println(encoded);
        encoded = encoder.encode("test234");//sara's password
        System.out.println(encoded);
    }

}
