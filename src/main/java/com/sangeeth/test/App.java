package main.java.com.sangeeth.test;

/**
 * Sample App!
 *
 */

import java.util.logging.Level;
import java.util.logging.Logger;


public class App 
{
	private static final Logger LOGGER = Logger.getLogger(App.class.getName());
    public static void main( String[] args )
    {
    	LOGGER.info("App Started");
        
    	LOGGER.log(Level.INFO, "App is running");
    	
    	LOGGER.log(Level.INFO, "Finished");
    	
    }
}
