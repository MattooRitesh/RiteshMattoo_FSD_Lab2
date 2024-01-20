package AssignemntCurrencyChange;

import java.util.Arrays;
import java.util.Scanner;

public class DriverClassReturnChange{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of currency notes in your country");
		int size=sc.nextInt();
		
		int currency[]=new int[size];
		System.out.println("Pleaae enter the note denominations");
		for (int i=0; i<currency.length; i++) {
			currency[i]=sc.nextInt();
			
		}
System.out.println("Before Sorting "+Arrays.toString(currency));
		
		DescendingOrderNoteSorting is=new DescendingOrderNoteSorting();
		is.sort(currency);
		System.out.println("After Sorting : "+Arrays.toString(currency));
		
		System.out.println("Enter Amount you wish to exchange");
		int amount=sc.nextInt();
		
		CountNumberOfNotes nc=new CountNumberOfNotes();
		nc.counting(currency,amount);
				
		

	

	}

}
