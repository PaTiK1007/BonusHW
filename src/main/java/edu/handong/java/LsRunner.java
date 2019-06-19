package edu.handong.java;

import java.io.File;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;




public class LsRunner {
	
	
	private boolean help;
	private String fileNamei;
	private String fileNames ;
	private String fileNamet ;
	private String fileNameq ;
	private String fileName1 ;
	
	private static File locate ;
	
	
	public void runLs(String[] args) throws ParseException {
		Options options = createOptions();
		CommandLineParser parser = new DefaultParser();
		CommandLine cmd = parser.parse(options, args);
		
		if(parseOptions(options, args)){
			if (help){
				printHelp(options);
				return;
			}
		}
		
		try {
		if(cmd.hasOption("i")) {
			locate = new File(fileNamei);
			
			Option_i opti =new Option_i();
			opti.runi(locate);
			
		}else if(cmd.hasOption("s")) {
			locate = new File(fileNames);
			
			Option_s opts =new Option_s();
			opts.runs(locate);
			
		}else if(cmd.hasOption("t")) {
			locate = new File(fileNamet);
			
			Option_t optt =new Option_t();
			optt.runt(locate);
			
		}else if(cmd.hasOption("Q")) {
			locate = new File(fileNameq);
			
			Option_Q optQ =new Option_Q();
			optQ.runQ(locate);
			
		}else if(cmd.hasOption("1")) {
			locate = new File(fileName1);
			
			Option_1 opt1 =new Option_1();
			opt1.run1(locate);
			
		}else {
				printHelp(options);
				return;
		}
		
		}catch(Exception e) {
			System.out.println("Not a proper directory. Please check again" + "\n");
			
			printHelp(options);
			return;
		}
		
}

	private boolean parseOptions(Options options, String[] args) {
		CommandLineParser parser = new DefaultParser();

		try {

			CommandLine cmd = parser.parse(options, args);
			
			fileNamei = cmd.getOptionValue("i");
			fileNames = cmd.getOptionValue("s");
			fileNamet = cmd.getOptionValue("t");
			fileNameq = cmd.getOptionValue("Q");
			fileName1 = cmd.getOptionValue("1");
			help = cmd.hasOption("help");


		} catch (Exception e) {
			printHelp(options);
			return false;
		}

		return true;
	}
    
    private Options createOptions() {
		Options options = new Options();

		options.addOption(Option.builder("i")
				.desc("print index of all files")
				.hasArg()
				.argName("directory name") 
				.build());
		
		options.addOption(Option.builder("s").longOpt("size")
				.desc("print size of all files")
				.hasArg()
				.argName("directory name") 
				.build());
		
	
		options.addOption(Option.builder("t")
				.desc("print last modification time of all files")
				.hasArg()    
				.argName("directory name")
				.build());
		
		
		options.addOption(Option.builder("Q").longOpt("quote-name")
				.desc("wrap files name with \"")
				.hasArg()    
				.argName("directory name")
				.build());
		
		options.addOption(Option.builder("1")
				.desc("print one file name for each lines")
				.hasArg()    
				.argName("directory name")
				.build());
		
		options.addOption(Option.builder("help").longOpt("help")
		        .desc("directory name")
		        .build());

		return options;
	}
	
	private void printHelp(Options options) {
		// automatically generate the help statement
		HelpFormatter formatter = new HelpFormatter();
		String header = "\n" + "List of options";
		String footer ="";
		formatter.printHelp("ls Implemintation Program", header, options, footer, true);
	}

}
