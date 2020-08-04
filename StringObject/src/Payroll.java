import java.util.Scanner;

//This program demonstrates the Scanner class.
public class Payroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String name;
	int hours;
	double payRate;
	double grossPay;
	
	//Create a Scanner object to read input.
	Scanner keyboard = new Scanner(System.in);
	
	//Get the User's name.
	System.out.println("What is your name?");
	name = keyboard.nextLine();
	
	//Get the number of hours worked this week.
	System.out.println("How many hours did you work this week?");
	hours = keyboard.nextInt();
	
	//Get the user's hourly pay rate.
	System.out.println("What is your houlry pay rate?");
	payRate = keyboard. nextDouble();
	
	//Calculate the gross pay.
	grossPay = hours * payRate;
	
	//Display the resulting information.
	System.out.println("Hello " + name);
	System.out.println("Your gross pay is $" + grossPay);
	keyboard.close();

	}

}
