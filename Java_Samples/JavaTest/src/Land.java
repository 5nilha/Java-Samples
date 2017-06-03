import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Land extends UserInput {
	
	private double numX,numY,numZ;

	// Class Constructor 
	public Land(){
		
	}
	
	public double getNumX(){
		return this.numX;
	}
	
	public void setNumX(double numX){
		this.numX = numX;
	}
	
	public double getNumY(){
		return this.numY;
	}
	
	public void setNumY(double numY){
		this.numY = numY;
	}
	
	public double getNumZ(){
		return this.numZ;
	}
	
	public void setNumZ(double numZ){
		this.numZ = numZ;
	}
	
	public static double rootCalculation(double area, int length, int width){
		return Math.sqrt(area/(length*width));//Solves the equation for common number
	}

	public void enclosureCalculation(){
		int length = getLength();
		int width = getWidth();
		double root = rootCalculation(getArea(), length, width);
		setNumX(length * root);
	    setNumY(width * root);
	    setNumZ((2*numX)+(2*numY));
	    showMessage();
	}
	
	public void showMessage() {
		DecimalFormat twoDec = new DecimalFormat("#0.00");
		 JOptionPane.showMessageDialog(null, "Your enclosure has dimensions " + twoDec.format(getNumX()) + 
		    		" feet by " + twoDec.format(getNumY())+ " feet.\n You will need " + twoDec.format(getNumZ())+ " feet of fence total.");    
	}
}