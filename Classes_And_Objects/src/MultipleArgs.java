import java.util.Scanner;

/**
 * This program demonstrates how to pass multiple arguments to a method.
 * @author prasa
 *
 */
public class MultipleArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double boxLength, boxWidth;
		
		
		
		//Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
		//Create a Rectangle Object.
		Rectangle box = new Rectangle();
		
		//Get the box's length.
		System.out.print("What is the box length?");
		boxLength = keyboard.nextDouble();
		
		//Get the box's width.
		System.out.println("What is the box's width?");
		boxWidth = keyboard.nextDouble();
		
		//pass boxLength and boxWidth to the set method.
		box.set(boxLength, boxWidth);
		
		//Display the box's  length, width and area.
		System.out.println("The box's length is "+ box.getLength());
		System.out.println("The box's width is "+ box.getWidth());
		System.out.println("The box's area is "+ box.getArea());
		
		keyboard.close();
		
		
		
		

	}

}
