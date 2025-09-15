package com.suphawinee.ku.KuSoftwareConstruction.AfterMid.JavaIO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fileWriter = null;
		try {
		// read from user
			InputStreamReader inReader = new InputStreamReader(System.in);
			BufferedReader buffer = new BufferedReader(inReader);
			// write to file
//			fileWriter = new FileWriter("from-user.txt"); // replace all on file
			fileWriter = new FileWriter("from-user.txt", true); // append on file
			PrintWriter out = new PrintWriter(fileWriter);
			System.out.println("Input text to file:");
			String line = buffer.readLine();
			while (!line.equals("bye")) {
				out.println("-----> " + line);
				line = buffer.readLine();
			}			
			out.flush();
		}
		catch (IOException e){
		System.err.println("Error reading from user");
		}	
		finally {
			// close file
		}
	}

}
