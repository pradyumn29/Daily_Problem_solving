import java.util.Scanner;

class CheckOccurance {


	public int firstNonRepeating(int arr[], int n) {
	    // Loop for checking each element
	    for (int i = 0; i < n; i++) {
	        boolean flag = false;
	        // Checking if ith element is present in array
	        for (int j = 0; j < n; j++) {
	            if (i != j && arr[i] == arr[j]) {
	                flag = true;
	                break;
	            }
	        }
	        // if ith element is not present in array
	        // except at ith index then return element
	        if (flag==false) {
	            return arr[i];
	        }
	    }

	    return -1;
	}
  
}

public class NonOccurance{
	
	public static void main(String []arg)
	{
		Scanner sc= new Scanner(System.in);
		//size of array
		System.out.println("enter size of array:");
		int iSize=sc.nextInt();
		
		int []a =new int[iSize];
		//Array initialization
		System.out.println("Enter array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		CheckOccurance co=new CheckOccurance();
		int iRet=0;
		iRet=co.firstNonRepeating(a,iSize);
		System.out.println("first non repeating element is:"+iRet);
		
		
	}
}
