package app;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * DemoJsonFiles class for handling JSON serialization and deserialization of Car objects.
 */
public class DemoJsonFiles {
	
	/**
	 * Saves a Car object to a JSON file.
	 *
	 * @param filename The name of the file to save to.
	 * @param car      The Car object to be saved.
	 * @param append   If true, appends to the file; otherwise, overwrites the file.
	 */
	private static void saveToFile(String filename, Car car, boolean append) {
		PrintWriter pw = null;
		try {
			// Create a file to write
			// Discussion: How and why would a BufferedWriter improve this code?
			File file = new File(filename);
			FileWriter fw = new FileWriter(file, append);
			pw = new PrintWriter(fw);
			
			// Write Car as JSON
			ObjectMapper objectMapper = new ObjectMapper();
			String json = objectMapper.writeValueAsString(car);
			pw.println(json);
			
			// Cleanup
			// Discussion: What is wrong with this code?
			pw.close();
		}
		catch (Exception e) {
			// Print exception
			// Discussion: What is wrong with this code?
			e.printStackTrace();
		}
		finally {
			// Close the PrintWriter and FileWriter in the finally block
			if(pw != null) {
				pw.close();
			}
		}
	}
	
	/**
	 * Reads Car objects from a JSON file.
	 *
	 * @param filename The name of the file to read from.
	 * @return An ArrayList of Car objects read from the file.
	 */
	private static ArrayList<Car> readFromFile(String filename) {
		
		ArrayList<Car> cars = new ArrayList<Car>();
		try {
			// Open the file to read
			// Discussion: How and why would a BufferedReader improve this code?
			File file = new File(filename);
			Scanner s = new Scanner(file);
			
			// Create list of Cars by reading JSON file
			while(s.hasNext()) {
				// Read a string of JSON and convert to a Car
				String json = s.nextLine();
				ObjectMapper objectMapper = new ObjectMapper();
				Car car = objectMapper.readValue(json, Car.class);
				cars.add(car);
			}
			
			// Cleanup
			// Discussion: What is wrong with this code
//			s.close();
		}
		catch (Exception e) {
			// Print exception
			// Discussion: What is wrong with this code?
			e.printStackTrace();
		}
		// Return the list of Cars
		return cars;
	}
	
	/**
	 * The main method to demonstrate JSON serialization and deserialization of Car objects.
	 *
	 * @param args The command-line arguments.
	 */
	public static void main(String[] args) {
	    // Create some Cars using an array
	    Car[] cars = new Car[5];
	    cars[0] = new Car(2018, "Ford", "Mustang", 0, 1.5d);
	    cars[1] = new Car(2018, "Chevy", "Blazer", 1000, 1.5d);
	    cars[2] = new Car(2019, "Toyota", "Camry", 2000, 1.5d);
	    cars[3] = new Car(2018, "Toyota", "Avalon", 90000, 2.5d);
	    cars[4] = new Car(2010, "GMC", "Silverado", 10000, 3.5d);

	    try {
	        // Write the Cars to a file as JSON
	        for (int x = 0; x < cars.length; ++x) {
	            // Write Car to a JSON file
	            saveToFile("out.json", cars[x], true);
	        }

	        // Read the Cars from the file and print out
	        ArrayList<Car> carsList = readFromFile("out.json");
	        for (Car car : carsList) {
	            String text = Integer.toString(car.getYear()) + "," + car.getMake() + ","
	                    + Integer.toString(car.getOdometer()) + "," + Double.toString(car.getEngineLiters());
	            System.out.println(text);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}