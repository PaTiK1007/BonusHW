package edu.handong.java;

import org.apache.commons.cli.ParseException;

public class Main {

	public static void main(String[] args) throws ParseException {
		LsRunner runner = new LsRunner();
		runner.runLs(args);
	}

}
