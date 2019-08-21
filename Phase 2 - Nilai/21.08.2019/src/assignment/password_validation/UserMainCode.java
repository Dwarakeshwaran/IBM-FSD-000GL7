package assignment.password_validation;

public class UserMainCode {
	public static boolean checkPassword(String password) {

		final String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";

		boolean upperCase = false;
		boolean lowerCase = false;
		boolean number = false;
		boolean specialCharacters = false;
		int flag = 0;

		if (password.length() >= 8) {
			for (int i = 0; i < password.length(); i++) {
				char ch = password.charAt(i);
				if (Character.isUpperCase(ch))
					upperCase = true;
				else if (Character.isLowerCase(ch))
					lowerCase = true;
				else if (Character.isDigit(ch))
					number = true;
				else if (specialChars.contains(String.valueOf(ch)))
					specialCharacters = true;
			}
			if (upperCase == true && lowerCase == true && number == true && specialCharacters == true)
				flag=1;;
		}
		else
			flag=0;		
		
		if(flag==1)
			return true;
		else
			return false;
	}
	
	
}
