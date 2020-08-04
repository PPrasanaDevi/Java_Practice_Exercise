/**
 * Rectangle class, phase 1 
 * Under constructon
 * @author prasa
 *
 */
public class Rectangle {

	private double length;
	private double width;
	
	
	
	
	/**
	 * 
	 * The setLength method accepts an argument that is 
	 * stored in the length field.
	 */
	public void setLength(double len) {
		length = len;
	}
	/**
	 * 
	 * The setWidth method accepts an argument that is 
	 * stored in the length field.
	 */
	public void setWidth(double wid) {
		width = wid;
	}
	
	public void set(double len, double wid){
		length = len;
		width =wid;
	
	}
	
	/**
	 * The getLength method returns the value stored in the length field.
	 * 
	 */
	public double getLength() {
		return length;
	}
	
	/**
	 * The getWidth method returns the value stored in the length field.
	 * 
	 */
	public double getWidth() {
		return width;
	}
	
	/**
	 * The getArea method returns the value of the length
	 * field times the width field.
	 * 
	 */
	public double getArea() {
		return length * width;
	}

}
