package com.suphawinee.ku.KuSoftwareConstruction.AfterMid.JavaIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferLoopFile {

	public static void main(String[] args) {

		String filename = "hello.txt";
		try (BufferedReader buffer = new BufferedReader(new FileReader(filename))){

			FileReader fileReader = new FileReader(filename);
			
			System.out.println("Open file:");
			String line;
			
			while ((line = buffer.readLine()) != null) {
				
				System.out.println("-----> " + line);
			}
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.err.println("Can not read file: " + filename);
		}
		catch (IOException e){
			// TODO: handle exception
			System.err.println("Error reading from file");
		}
	}

}
