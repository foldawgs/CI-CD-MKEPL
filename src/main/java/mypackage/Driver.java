package mypackage;

import java.util.logging.Logger;

public class Driver {

	private static final Logger LOGGER = Logger.getLogger(Driver.class.getName());
	private static final String PREFIX = "Count: ";

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		LOGGER.info(PREFIX + counter.getCount());
		
		counter.increment();
		
		LOGGER.info(PREFIX + counter.getCount());
		
		counter.decrement();
		
		LOGGER.info(PREFIX + counter.getCount());
		
	}

}
