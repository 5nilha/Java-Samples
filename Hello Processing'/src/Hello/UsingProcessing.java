package Hello;

import processing.core.PApplet;

public class UsingProcessing extends PApplet {

	public static void main(String[] args) {
		PApplet.main("Hello.UsingProcessing");
		

	}
	
	int[] angles = { 30, 10, 45, 35, 60, 38, 75, 67};
	public void settings() {
		size (700, 500);
	}

	public void setup() {
		fill(120, 50, 240);
		background (0);
		
	}
	
	public void draw() {
		pieChart(300, angles);
	
		 translate(width/2, height/2);
		
	}
	
	void pieChart(float diameter, int[] data) {
		  float lastAngle = 0;
		  for (int i = 0; i < data.length; i++) {
			int rand = (int) (random(i) % 255 + 1);
		    float gray = map(rand, 0, data.length, 0, 255);
		    fill(gray);
		    arc(width/2, height/2, diameter, diameter, lastAngle, lastAngle+radians(angles[i]));
		    lastAngle += radians(angles[i]);
		    
		  }
	}
}
