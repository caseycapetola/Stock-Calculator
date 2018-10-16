/**
 * 
 * @author Casey Capetola
 *
 */

import java.util.Scanner;
public class StockCalculator 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.print("Welcome to the Stock Calculator!\nPress Enter to continue: ");
		user.nextLine();
		System.out.print("Please enter the number of shares purchased: ");
		String shareStr = user.nextLine();
		int share = Integer.parseInt(shareStr);
		System.out.print("\nPlease enter the price per share when purchased: ");
		String priceStr = user.nextLine();
		double priceBuy = Double.parseDouble(priceStr);
		System.out.print("\nPlease enter the commission rate for the purchase: ");
		String comStr = user.nextLine();
		double comBuy = Double.parseDouble(comStr);
		System.out.print("\nPlease enter the price per share when sold: ");
		String priceString = user.nextLine();
		double priceSell = Double.parseDouble(priceString);
		System.out.print("\nPlease enter the commission rate for the sale:  ");
		String comString = user.nextLine();
		double comSell = Double.parseDouble(comString);
		
		double totalPaid = share*priceBuy;
		double comPurchase = totalPaid*comBuy;
		double totalSell = share*priceSell;
		double comSale = totalSell*comSell;
		double net = totalSell-totalPaid-comPurchase-comSale;
		
		System.out.println("\nResults: ");
		System.out.println("Total paid for " + share + " shares: $" + totalPaid);
		System.out.println("Commission on purchase: $"  + comPurchase);
		System.out.println("Total sale price for " + share + " shares: $" + totalSell);
		System.out.println("Commission on sale: $" + comSale);
		System.out.println("Net gain/loss: $" + net);
		

	}

}
