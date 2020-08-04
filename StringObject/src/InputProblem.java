import java.util.Scanner;

//This Program correctly read numeric and string input.
public class InputProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String name;
	int age;
	double income;
	
	//Create a Scanner object to read input.
	Scanner keyboard = new Scanner(System.in);
	
	//Get the user's age.
	System.out.print("What is your age? ");
	age = keyboard.nextInt();
	
	//Get the user's income
	System.out.print("What is your annual income?");
	income = keyboard.nextDouble();
	
	//Consume the remaining new line.
	keyboard.hasNextLine();
	
	//Get the user's name.
	System.out.print("What is your name?");
	name = keyboard.nextLine();
	
	//Display the information back to the user.
	System.out.println("hello" + name + ". Your age is "+ age + " and your income is $" + income);
	
keyboard.close();
	}

}
