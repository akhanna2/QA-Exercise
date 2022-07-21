package org;

import java.io.FileReader;

public class LogException {
	public void fileNotFound() throws Exception {
		FileReader fr = new FileReader("x.txt");
		fr.close();
	}
	
	public void DivideByZero() throws Exception{
		System.out.println(10/0);
	}
}
