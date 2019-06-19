package edu.handong.java;

import java.io.File;

public class Option_Q {


	public void runQ(File locate) {
		
		String childs[] = locate.list();
		
		for(String child: childs){
			
	        System.out.println("\""+ child+ "\"");
	    }
		
	}

}
