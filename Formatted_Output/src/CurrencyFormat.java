/**
 * This program demonstrates how to use the System.out.printf method
 * to format a number as currency.
 * @author prasa
 *
 */
public class CurrencyFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double monthlyPay = 5000.0;
		double annualPay = monthlyPay * 12;
		
		System.out.printf("Your annual pay is $%,.2f\n",annualPay);

	}

}
