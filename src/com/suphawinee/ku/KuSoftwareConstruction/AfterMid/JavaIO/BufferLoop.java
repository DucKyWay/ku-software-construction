package com.suphawinee.ku.KuSoftwareConstruction.AfterMid.JavaIO;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BufferLoop {

	public static void main(String[] args) {
		
		System.out.print("Enter characters: ");
		
		try {
			
			InputStreamReader inReader = new InputStreamReader(System.in);
			BufferedReader buffer = new BufferedReader(inReader);
			System.out.println("Enter lines:");
			
			String line = buffer.readLine();
			while (!line.equals("bye")) {
				
				System.out.println("-----> " + line);
				line = buffer.readLine();
			}
		}
		catch (IOException e){
			
			System.err.println("Error reading from user");
		}
	}

}
