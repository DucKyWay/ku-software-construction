package com.suphawinee.ku.KuSoftwareConstruction.AfterMid.JavaIO;

import java.io.IOException;

public class BasicIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			int a = System.in.read();
			char b = (char) a;
			System.out.println("ASCII: " + a);
			System.out.println("CHAR:  " + b);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("This is out Stream");
		System.err.println("ERROR: Not thing eiei.");
	}

}
