package logger;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;

/**
 * Hello world!
 *
 */
public class Practice{
	
	private static Logger log =Logger.getLogger(Practice.class);
	
  
	
public static void main( String[] args ) {
    	       
    	log.debug(" we are from debug");
    	log.info(" we are From Info");
		log.warn(" we are From Warn");
		log.error(" we are From Error");
		log.fatal("we are From Fatal");
		
    	
    }
}
