package edu.handong.java;

import java.io.File;

public class Option_s {

	public void runs(File locate) {
		
		File[] childs = locate.listFiles();
		
		for(File child: childs){
			
			long size = child.length();
			
	        System.out.println(size +" "+ child.getName());
	    }
		
	}


}
