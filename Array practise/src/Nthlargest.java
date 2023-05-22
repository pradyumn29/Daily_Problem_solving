package daily;
import java.util.Scanner;

class NthCheck
{
	//bussiness logic block
  public void Operation(int a[],int N)
  {
	  //Sorting of array
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
	} 
	 System.out.println(N+" th largest value is:"+a[N-1]);
  }
  
  
}

//Driver code
public class Nthlargest {
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
		
		System.out.println("Enter the Nth value to find:");
		//nth largest number to find
		int iNo=sc.nextInt();
		
		//constructor calling
		NthCheck ck= new NthCheck();
		
		ck.Operation(arr,iNo);

	}


}



	
	
		

