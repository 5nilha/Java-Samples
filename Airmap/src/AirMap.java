import java.util.ArrayList;

import processing.core.PApplet;


public class AirMap  extends PApplet{
	
	float Hi_Longitude = 0;
	float Hi_Latitude = 0;
	float Hi_Altitude = 0;
	float Lo_Longitude = 0;
	float Lo_Latitude = 0;
	float Lo_Altitude = 0;
	
	ArrayList<Coordinate> List = new ArrayList<Coordinate>();

	public static void main(String[] args) {
		PApplet.main("AirMap");
		

	}

	public void settings() {
		size (1000, 1000);

	}

	public void setup() {
		background (0);
		
		ArrayList<Float> Longitude = Coordinate.longitude();
		ArrayList<Float> Latitude = Coordinate.latitude();
		ArrayList<Float> Altitude = Coordinate.altitude();
		
		
		Hi_Longitude = Longitude.get(0);
		Lo_Longitude = Longitude.get(0);
		
		
		
		for (int i = 0 ; i < Longitude.size(); i++){
			if (Longitude.get(i) > Hi_Longitude){
				Hi_Longitude = Longitude.get(i);
			}
			if (Longitude.get(i) < Lo_Longitude){
				Lo_Longitude = Longitude.get(i);
			}
		}

		Hi_Latitude = Latitude.get(0);
		Lo_Latitude = Latitude.get(0);
		
		for (int i = 0 ; i < Latitude.size(); i++) {
			if (Latitude.get(i) > Hi_Latitude){
				Hi_Latitude = Latitude.get(i);
			}
			if (Latitude.get(i) < Lo_Altitude){
				Lo_Latitude = Latitude.get(i);
			}
			
		}
		
		Hi_Altitude = Altitude.get(0);
		Lo_Altitude = Altitude.get(0);
		for (int i = 0 ; i < Altitude.size(); i++) {
			if (Altitude.get(i) > Hi_Altitude){
				Hi_Altitude = Altitude.get(i);
			}
			if (Altitude.get(i) < Lo_Altitude){
				Lo_Altitude = Altitude.get(i);
			}
		}
		
		for (int i = 0; i < Altitude.size(); i++){
			float value = Altitude.get(i);
			float m = map(value, Lo_Altitude, Hi_Altitude, 5, 500);
			List.add(new Coordinate());
			List.get(i).setAltitude(m);
			
		}
		
		for (int i = 0; i < Coordinate.latitude().size(); i++){
			float value = Coordinate.latitude().get(i);
			float m = map(value, Lo_Latitude, Hi_Latitude, 5, 500);
			List.get(i).setX(m);
			
		}
		
		for (int i = 0; i < Coordinate.longitude().size(); i++){
			float value = Coordinate.longitude().get(i);
			float m = map(value, Lo_Longitude, Hi_Longitude, 5, 500);
			List.get(i).setY(m);
		}
	}
	
	public void draw() {
		for (int i = 0; i < List.size(); i++){
			stroke(255, 255, 255);
			System.out.println(List.get(i).getX() + " " + List.get(i).getY());
			point(List.get(i).getX(), List.get(i).getY());
		}

	}
	
	
}
