package com.suphawinee.ku.KuSoftwareConstruction.AfterMid.JavaIO;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Buffer {

	public static void main(String[] args) {
		
		System.out.print("Enter characters: ");
		try {
		
			InputStreamReader inReader = new InputStreamReader(System.in);
			BufferedReader buffer = new BufferedReader(inReader);
			String line = buffer.readLine();
			System.out.println("You entered: " + line);
		}
		catch (IOException e){
			System.err.println("Error reading from user");
		}
	}

}
