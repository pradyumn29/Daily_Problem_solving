package daily;

import java.util.Scanner;

class SortCheck
{
  public void Operation(int a[])
  {//bussiness logic block

	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			int temp=0;
			if(a[i]>a[j])
			{
			    temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		 System.out.println(a[i]);
	} 

  }
  
  
}

//Driver code
public class ArraySort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		//Size of Array
		int iSize=sc.nextInt();
		
		int []arr=new int[iSize];
		
		//Array declaration
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//constructor calling
		SortCheck ck= new SortCheck();
		
		ck.Operation(arr);

	}


}
