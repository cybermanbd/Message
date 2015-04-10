package org.diu.mess;

import java.io.UnsupportedEncodingException;
import java.util.List;

public class message {
	
	public static void main(String[] args) throws UnsupportedEncodingException{
		String Receive_Message = ("আ"+"ম"+"ি"+"ও"+"আ"+"ম"+"ি"+"ও");
		String [] tempUniocde = new String[Receive_Message.length()] ;
		String [] Final = new String[tempUniocde.length];
		String temp;
	
		
		char [] cMessage = Receive_Message.toCharArray();

		
		
		for (int i = 0; i < cMessage.length; i++)
		{
			temp = (Integer.toHexString(cMessage[i] | 0x10000).substring(1)) ;
			tempUniocde[i] = temp;
			
			
		}
		
		int j=0;
		
		for (int i = 0; i <tempUniocde.length; i++)
		{
			if (tempUniocde[i].equals("09bf"))
			{
				Final[j-1] = Final[j-1]+"1";
				
				
			}
			
			else 
				{
				Final[j] = tempUniocde[i];
				j++;
				
				}
			
		}
	
		
		for (int i = 0; i <Final.length; i++)
		{
			System.out.println(Final[i]);
			
			
			
		}
		
    }

}
