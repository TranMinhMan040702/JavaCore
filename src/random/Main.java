package random;

import java.util.Base64;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		String alphanumericCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuv";
		 
	    StringBuffer randomString = new StringBuffer(64);
	    Random random = new Random();
	 
	    for (int i = 0; i < 64; i++) {
	        int randomIndex = random.nextInt(alphanumericCharacters.length());
	        char randomChar = alphanumericCharacters.charAt(randomIndex);
	        randomString.append(randomChar);
	    }
	    
	    String encode = Base64.getEncoder().encodeToString(randomString.toString().getBytes());
	 
	    System.out.println("Original: " + randomString);
	    System.out.println("Encode: " + encode);
	}
}
