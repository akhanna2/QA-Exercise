package org;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {

	public static void main(String[] args) {
		LogException le = new LogException();
		Logger log = Logger.getLogger("");
		
		try {
			le.fileNotFound();
		} catch (Exception e) {
			log.log(Level.WARNING, "File not found");
			//e.printStackTrace();
		}
		
		try {
			le.DivideByZero();
		} catch (Exception e) {
			log.log(Level.WARNING, "Cannot divide by zero");
			//e.printStackTrace();
		}

	}

}
