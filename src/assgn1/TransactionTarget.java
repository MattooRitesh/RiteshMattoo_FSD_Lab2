package assgn1;

import java.util.Scanner;

public class TransactionTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Number of Days Shop was open");
		int noOfDays=sc.nextInt();
		
		int revenue[]=new int[noOfDays];
		System.out.println("Please enter the collection for each day");
		for (int i =0; i<revenue.length; i++)
		{
			revenue[i]=sc.nextInt();
			
		}
		System.out.println("Please enter Number of Targets");
		int totaltargets=sc.nextInt();
		int sum;
		boolean flag;
		for (int i =1; i<=totaltargets; i++)
		{
			sum=0;
			flag=false;
			System.out.println("Please enter value of Target " +i);
			int target=sc.nextInt();
			
			for (int j=0;j<revenue.length;j++)
			{
				sum+=revenue[j];
				if (sum>=target)
				{
					System.out.println("Target Achieved of Day"+(j+1));
					flag=true;
					break;
				
				}
			}
			if (!flag)
				System.out.println("Target Not Achieved");
			//break;
		}
sc.close();
	}

}
