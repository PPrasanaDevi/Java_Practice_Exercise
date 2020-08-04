/**	
 * This program displays a variety of floating-point numbers in a column with their
 * decimal points aligned.
 * @author prasa
 *
 */
public class Columns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare a variety of double variables.
		double num1 = 127.899;
		double num2 = 12756.899;
		double num3 = 7.899;
		double num4 = 725.899;
		double num5 = 11.991;
		double num6 = 4127.899;
		
		//Display each variable in a field of 
		System.out.printf("%8.2f\n", num1);
		System.out.printf("%8.2f\n", num2);
		System.out.printf("%8.2f\n", num3);
		System.out.printf("%8.2f\n", num4);
		System.out.printf("%8.2f\n", num5);
		System.out.printf("%8.2f\n", num6);

	}

}
