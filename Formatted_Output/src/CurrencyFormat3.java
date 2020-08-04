import javax.swing.JOptionPane;

/**
 * This program demonstrates how to use the String Format 
 * method to format a numbera as a currency.
 * @author prasa
 *
 */
public class CurrencyFormat3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double monthlyPay = 5000.0;
		double annualPay = monthlyPay * 12;
		
		JOptionPane.showMessageDialog(null,String.format("Your annual pay is $%,.2f", annualPay));

	}

}
