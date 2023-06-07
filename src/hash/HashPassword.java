package hash;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashPassword {
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
		System.out.println(hashSHA256("123456", "cristran040702@gmail.com"));
	}
	
	public static String hashSHA256(String pass, String email) throws NoSuchAlgorithmException {
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		String pass_email = pass + email;
		byte[] hash = digest.digest(pass_email.getBytes(StandardCharsets.UTF_8));
		return new String(hash, StandardCharsets.UTF_8);
		
	}
	
	

}
