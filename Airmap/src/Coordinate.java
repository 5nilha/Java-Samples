import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Coordinate {
	
	static File file = new File ("/Users/fabioquintanilha/Documents/Java_Samples/Airmap/planes_project.txt");
	float x;
	float y;
	float altitude;
	
	
	public Coordinate(float x, float y, float altitude) {
		this.x = x;
		this.y = y;
		this.altitude = altitude;
		
	}
	
	public Coordinate () {
		
	}
	
	public float getX () {
		return x;
	}
	
	
	
	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getAltitude() {
		return altitude;
	}

	public void setAltitude(float altitude) {
		this.altitude = altitude;
	}

	public void setX(float x) {
		this.x = x;
	}

	public static ArrayList<String> aircraftID() {
		
		ArrayList<String>aircraft_ID = new ArrayList<String>();

	
		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		    			
			String line = null;
			
			while ((line = br.readLine()) != null) {		
				String [] tokens = line.split("\\s+");
		    	aircraft_ID.add(tokens[3]);

			}
		    
		    return aircraft_ID;
		}
		catch (IOException excpt) {
			System.out.println("Caught IOException: " + excpt.getMessage());
		}	
		
		return null;
	}
	
	
public static ArrayList<Float> altitude() {
		
		ArrayList<Float>altitude = new ArrayList<Float>();

	
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		    			
			String line = null;
			
			while ((line = br.readLine()) != null) {		
				String [] tokens = line.split("\\s+");
				try {
					altitude.add(Float.parseFloat(tokens[4]));
				} catch (Exception e){
					
				}
			}
		    
		    return altitude;
		
		}
		catch (IOException excpt) {
			System.out.println("Caught IOException: " + excpt.getMessage());
		}	
		
		return null;
		
	}
	

public static ArrayList<Float> latitude() {
	
	ArrayList<Float>latitude = new ArrayList<Float>();


	try {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
	    			
		String line = null;
		
		while ((line = br.readLine()) != null) {		
			String [] tokens = line.split("\\s+");
			
			try {
				latitude.add(Float.parseFloat(tokens[5]));
			}catch (Exception e){
				
			}
			
		}
		
	    return latitude;
	
	}
	catch (IOException excpt) {
		System.out.println("Caught IOException: " + excpt.getMessage());
	}	
	
	return null;
	
}


public static ArrayList<Float> longitude() {
	
	ArrayList<Float>longitude = new ArrayList<Float>();


	try {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
	    			
		String line = null;
		
		while ((line = br.readLine()) != null) {		
			String [] tokens = line.split("\\s+");
			try {
				longitude.add(Float.parseFloat(tokens[6]));
			}catch (Exception e){
				
			}
			
		}
		 
	    return longitude;
	
	}
	catch (IOException excpt) {
		System.out.println("Caught IOException: " + excpt.getMessage());
	}	
	
	return null;
	
  }

	
}



