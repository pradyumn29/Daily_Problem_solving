/*
 * Given an array of N integers, and a number sum, the task is to find the number of pairs of integers in the array whose sum is equal to sum.

Examples:  

Input:  arr[] = {1, 5, 7, -1}, sum = 6
Output:  2
Explanation: Pairs with sum 6 are (1, 5) and (7, -1).
*/




package daily;

import java.util.Scanner;

class PairCheck
{
	  //bussiness logic block

  public void Operation(int a[],int N)
  {
	  int Cnt=0;
	  for(int i=0;i<a.length;i++)
	  {
		  for(int j=i+1;j<a.length;j++)
		  {
			if(a[i]+a[j]==N)  
			{
				System.out.println("["+a[i]+","+a[j]+"]");
				Cnt++;
			}
		  }
	  }
	  //count of pairs
	  System.out.println(Cnt);
  }
}

public class SumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size array:");
	     int Size=sc.nextInt();
	     
	     //Size of array
	     int []a=new int[Size];
	     
	     //Array elements
	     System.out.println("Enter array elements:");
	     for(int i=0;i<a.length;i++)
	     {
	    	 a[i]=sc.nextInt();
	     }
	     
	     //number which sum has to find
	     System.out.println("enter number to find sum in array:");
	     int n=sc.nextInt();
	     PairCheck Ck=new PairCheck();
	     Ck.Operation(a,n);
	     
	}

}
