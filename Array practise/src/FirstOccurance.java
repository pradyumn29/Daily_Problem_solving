import java.util.Scanner;

//logic block
class FirstCheck
{
	public void Operation(int a[])
	{
		int val=0;
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
		  	{
				val=a[i];
			    flag= 1;	
			break; 
			}
			if(flag==1)
			{
				break;
			}
		
		  }
		}
		if(flag==1)
		{
			System.out.println(val);
		
		}
		else
		{
			System.out.println("no duplicate");
		}
	}
}

//driver code
public class FirstOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		//enter the size of array
		System.out.println("Enter the size of array:");
		int iSize=sc.nextInt();
		
		int []a=new int[iSize];
		
		System.out.println("Enter the values in the array:");
	   for(int i=0;i<a.length;i++)
	   {
		   a[i]=sc.nextInt();
	   }
	   
	  FirstCheck dc=new FirstCheck();
	   dc.Operation(a);
	   
	}

}
