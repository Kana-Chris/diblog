package com.diworksdev.diblog.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class PassUtil {
	public String password_hash(String password) {
		
		 String hash="";

		    try {
		      MessageDigest md = MessageDigest.getInstance("SHA-256");
		      md.update(password.getBytes());
		      byte[] hashBytes = md.digest();
		      hash = Base64.getEncoder().encodeToString(hashBytes);
		     
		     
		    } catch (NoSuchAlgorithmException e) {
		      e.printStackTrace();
		    }
		    return hash;
	}
}
