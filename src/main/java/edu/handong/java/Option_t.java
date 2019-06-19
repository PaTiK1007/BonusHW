package edu.handong.java;

import java.util.Calendar;
import java.io.File;

public class Option_t {

	public void runt(File locate) {
		
		File[] childs = locate.listFiles();
		
		for(File child: childs){
			
			long lastModDate = child.lastModified();
			
			Calendar cal = Calendar.getInstance();
			
			cal.setTimeInMillis(lastModDate);
			System.out.println(cal.getTime()+ " " + child.getName()); 
	    }
				
	}

}
