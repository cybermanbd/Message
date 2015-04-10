package org.diu.mess;

import java.io.UnsupportedEncodingException;

public class try_koro {
	public void try_kori() throws UnsupportedEncodingException{
		
		String Receive_Message = ("অ"+"আ");
		
		String [] Message = Receive_Message.split("");
		String temp = Message[1];
		byte[] utf8Bytes = temp.getBytes("UTF8");
		
		String roundTrip = new String(utf8Bytes, "UTF8");
	    System.out.println("roundTrip = " + roundTrip);
		
		
		
	}
	

}
