package com.NicholasEaster.handson6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class HandsOn {

	public static void main(String[] args) {
		// array of songs
		String[] songs = {"Rock With You", "Smooth Criminal", "Wanna Be Startin' Something", "Thriller", "Beat It"};
		// similar to fileReader, bufferedReader provides a faster option to read files
		BufferedReader reader;
		// fileWriter allows us to create, write, and manipulate files 
		FileWriter writer;
		// String to hold the read contents of the file we create
		String fileContentsRead = "";
		// StringBuilder object to hold formatted string of songs 
		StringBuilder formattedSongs = new StringBuilder();
		
		// for loop to iterate through songs array
		for (int i = 0; i < songs.length; i++) {
			// adding each element in songs to the formattedSongs StringBuilder
			formattedSongs.append(songs[i]);
			// Check if it is the last item in the songs array
			// if its not, add a comma and space between the item
			// this is so that a comma doesn't appear at the end of the list
			if (i + 1 != songs.length) {
				// add comma to separate songs in list
				formattedSongs.append(", ");
			}
		}
		// attempt to create a file and write that data from formattedSongs to it
		try {
			// create file songs.txt
			writer = new FileWriter("songs.txt");
			
			// write the formatted songs to the file we just created
			writer.write(formattedSongs.toString());
			
			// close the writer object so it doesn't take up extra memory
			writer.close();
			
			// read the file using the buffered reader with the fileReader
			// bufferedReader reads files faster than just fileReader
			reader = new BufferedReader(new FileReader("story.txt"));
			
			// string to hold the data of the the current line being
			// read by the program
			String line;
			// loop to read each line of the file and add that to the 
			// fileContents read string.
			while ((line = reader.readLine()) != null) {
				fileContentsRead = fileContentsRead + line;
			}
			
			// after we have read the file, close() to deallocate the memory
			reader.close();
		
		// if the file can not be created, or some unexpected error happens
		// throw an error 
		} catch (Exception e) {
			// prints the default java error that was caught
			e.printStackTrace();
			// custom message for a easier to read reason as to what 
			// the error was
			System.out.println("Error when writing songs.txt");
		}
		// print out the formatted songs to the console
		System.out.println(fileContentsRead);
	}

}
