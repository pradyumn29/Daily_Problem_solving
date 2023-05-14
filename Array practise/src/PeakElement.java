/*
 *
 * Given an array arr[] of integers. Find a peak element i.e. an element that is not smaller than its neighbors. 

  Note: For corner elements, we need to consider only one neighbor. 

  Example:

  Input: array[]= {5, 10, 20, 15}
  Output: 20
  Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.
*
*/


import java.util.Scanner;

class CheckPeakElement
{
	Scanner sc= new Scanner(System.in);
	public int []arr;
	
	
	//Parameterized Constructor
	public CheckPeakElement(int iSize)
	{
		System.out.println("enter array elements:");
		arr=new int[iSize];
	  for(int i=0;i<iSize;i++)
	  {
		//array initialization
		  
		  arr[i]=sc.nextInt();
	  }
	}
	
	//checking peak element block
	public void Check()
	{
		int iCount=0;
		for(int i=1;i<arr.length;i++)
		{
			if((i+1)<arr.length)
			{
				if(arr[i-1]<arr[i] && arr[i+1]<arr[i])
				{
					System.out.println("peak element:"+arr[i]);
					iCount++;
				}
			}
		}
		if(iCount==0)
		{
			System.out.println("no peak element");
		}
	}
}

public class PeakElement {

	public static void main(String[] args) {
		
        Scanner sc= new Scanner(System.in);
        
        //size of array
        System.out.println("Enter size of array:");
        int iSize=sc.nextInt();
        
        //parameterized constructor calling
        CheckPeakElement CP =new CheckPeakElement(iSize);
        CP.Check();
        
   	}

}
