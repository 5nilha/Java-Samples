import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class UserInput{
	private int width;
	private int length;
	private double area;
	
	public void setWidth(int width){
		this.width = width;
	}
	public int getWidth(){
		return this.width;
	}
	public void setLength(int length){
		this.length = length;
	}
	public int getLength(){
		return this.length;
	}
	public void setArea(double area){
		this.area = area;
	}
	public double getArea(){
		return this.area;
	}
	
	public void areaInput(){
		String input = JOptionPane.showInputDialog("What is the area?");
	    setArea(Double.parseDouble(input));  
	}
	
	public void length_and_Width_Input(){
		String input = JOptionPane.showInputDialog("Enter the length and width:");
	    int k = input.indexOf(' ');//To separate reading from string
	    setLength(Integer.parseInt(input.substring(0,k)));
	    setWidth(Integer.parseInt(input.substring(k+1)));
	}
	
	
}
