package daily;
import java.util.Scanner;

class UAndICheck
{
	//bussiness logic block
  public void Operation(int a[],int b[])
  {
	  //union and intersection of array
	  System.out.println("intersection:");
	for(int i=0;i<a.length;i++)
	{	
	  for(int j=0;j<b.length;j++)
	  {
		if(a[i]==b[j])
		{
			System.out.println(+a[i]);
		}
	  }
	} 
	  System.out.println("union:");
	int []c=new int[a.length+b.length];
	
	for(int i=0;i<a.length;i++)
	{
		c[i]=a[i];
	}
	for(int j=0;j<b.length;j++)
	  {
		  c[j+a.length]=b[j];
	  }	
	for(int j=0;j<c.length;j++)
	  {
		System.out.println(c[j]);
	  }	
   }  
}


//Driver code
public class UnionIntersection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		//Size of Array
		System.out.println("Enter the size of array");
		int iSize=sc.nextInt();
		
		int []arr=new int[iSize];
		
		System.out.println("Enter the array value");
		//Array declaration
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the size of array2");
		int iSize1=sc.nextInt();
		
		int []arr1=new int[iSize1];
		
		System.out.println("Enter the array2 value");
		//Array declaration
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		//constructor calling
		UAndICheck ck= new UAndICheck();
		
		ck.Operation(arr,arr1);
	}


}
