package daily;

import java.util.Scanner;


class Check
{//bussiness logic block

  public void Operation(int a[])
  {
	int Start=0;
	int End =a.length-1;
	int temp;
	while(End>Start)
	{
	
	temp=a[Start];
	a[Start]=a[End];
	a[End]=temp;
	Start++;
	End--;

	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
  }
  
  
}

//Driver code
public class ReverseArray {

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
		Check ck= new Check();
		
		ck.Operation(arr);

	}

}
