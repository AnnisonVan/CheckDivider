import java.util.Scanner;
/*
This program is to help people divide their checks between friends and family
*/
public class checkDivider
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Total number of people that ate?");
		int people = input.nextInt();
		System.out.println("What is the tax rate on the check? Please enter in percente form without the symbol.");
		double percent = input.nextDouble();
		int count = 0;
		int countPerson = 0;
		double salesTax = percent * .01;
		System.out.println("" + salesTax);

		while (people > count)
		{
			countPerson++;

			System.out.println("What is the price of the order for person " + countPerson);
			System.out.print("$");
			double price = input.nextDouble();
			double tax = salesTax * price;
			price = price + tax;
			System.out.println("Sales Tax is " + salesTax);
			/*
			Round the price to the tenth decimal place
			*/
			price = Math.round(price*100.0)/100.0;
			double fivePercent = 0;
			double tenPercent = 0;
			double fifteenPercent = 0;

			System.out.println("The total for this person is $" + price);

			/*
			Calculates the tip percent for 5%, 10%, and 15%
			Also rounds the numbers to the tenth
			*/
			fivePercent = price * .05;
			tenPercent = price * .1;
			fifteenPercent = price * .15;
			fivePercent = Math.round(fivePercent*100.0)/100.0;
			tenPercent = Math.round(tenPercent*100.0)/100.0;
			fifteenPercent = Math.round(fifteenPercent*100.0)/100.0;

			double hold5per = price + fivePercent;
			double hold10per = price + tenPercent;
			double hold15per = price + fifteenPercent;

			/*
			Shows the tips and total with the tip per entry
			*/
			System.out.printf("%-15s%-10s\n", "Tip", "Total");
			System.out.printf("%-15s%-10s\n", "5%: $" + fivePercent, "$" + hold5per);
			System.out.printf("%-15s%-10s\n", "10%: $" + tenPercent, "$" + hold10per);
			System.out.printf("%-15s%-10s\n", "15%: $" + fifteenPercent, "$" + hold15per);
			System.out.println("");

			count++;
		}

	}
}