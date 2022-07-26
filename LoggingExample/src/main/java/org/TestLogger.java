package org;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLogger {

	public static void main(String[] args) {
		Logger LOGGER = LogManager.getLogger();
		LOGGER.info("This will give INFO message");
		LOGGER.warn("This will give warning");
		LOGGER.fatal("This will be fatal");
		
		try {
			FileReader fr = new FileReader("y.txt");
		} catch (FileNotFoundException e) {
			LOGGER.catching(e);
			LOGGER.debug(e.getStackTrace());
			LOGGER.error(e.getMessage());
		}

	}

}
