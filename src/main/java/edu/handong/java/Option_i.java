package edu.handong.java;

import java.io.File;

public class Option_i {
	
	public void runi(File locate) {
		
		File[] childs = locate.listFiles();
		
		for(File child: childs){
			
			long index = child.hashCode();
			
	        System.out.println(index +" "+ child.getName());
	    }
		
		
		
	}

}
