package br.com.panfletonline.Validations;

import java.nio.ByteBuffer;

public class Validations {
	
	public String geraHash(String email) {
		byte[] hash1, hash2, hash3;
		
		hash1 =  ByteBuffer.wrap(new byte[8]).putLong((long) (System.currentTimeMillis() * 3.784)).array();
		hash2 = ByteBuffer.wrap(new byte[8]).putLong((long) (System.currentTimeMillis() * 8.698)).array();
		ByteBuffer bb = ByteBuffer.allocate(hash1.length + hash2.length);
		bb.put(hash1);
		bb.put(hash2);
		hash3 = bb.array();
		
		StringBuilder hexString = new StringBuilder(2 * hash3.length);
	    for (int i = 0; i < hash3.length; i++) {
	        String hex = Integer.toHexString(0xff & hash3[i]);
	        hexString.append(hex);
	    }
	    return hexString.toString();
	}

}
