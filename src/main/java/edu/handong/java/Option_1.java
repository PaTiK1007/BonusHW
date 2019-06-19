package edu.handong.java;

import java.io.File;

public class Option_1 {
	

	public void run1(File locate) {
		String childs[] = locate.list();
		
		for(String child: childs){
			
	        System.out.println(child);
	    }
	}
	    
	    
	
}
