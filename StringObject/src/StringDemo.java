// A simple program demonstrating String objects.
public class StringDemo {
public static void main(String[] args) {
	String greeting = "Good Morning ";
	String name = "Herman";
	
	int stringSize = name.length();
	String littlename = name.toLowerCase();
	System.out.println(greeting + name);
	System.out.println(name + " has " + stringSize + " characters.");
	System.out.println(littlename);
	
}
}
