package daily;
import java.util.Scanner;
import daily.StringN;

//driver Code
public class StringUpdation {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		//String value from user
		System.out.println("Enter string");	
	     String s=sc.next();
	     
	     //String to char array
	     char []a=s.toCharArray();
	     
			/*
			 * //Printing char arrray
			 *  for(int i=0;i<a.length;i++)
			 *   {
			 *      System.out.println(a[i]);
			 *  }
			 */
	     
	     int ch,index;
	     
	     do
	     {
	    	 System.out.println("Enter Choice: 1.Insertion  2.Deleted  3.Update");
	    	 ch=sc.nextInt();
	    	 
	    	 switch(ch)
	    	 {
	    	 case 1://insertion string
	    		 System.out.println("Enter string to insert:");
	    		 String s1=sc.next();
	    		 char []a1=s1.toCharArray();
	    		 
	    		 System.out.println("Enter index:");
	    		 index=sc.nextInt();
	    		 
	    		 StringN sn=new StringN(a,a1,index);
	    		 sn.Add();
	    		break;
	    		
	    	 case 2://delete string
	    		 System.out.println("Enter string delete:");
	    		 String s2=sc.next();
	    		 char []a2=s2.toCharArray();
	    		 
	    		 System.out.println("Enter index:");
	    		 index=sc.nextInt();
	    		 
	    		 StringN sp=new StringN(a,a2,index);
	    		 sp.Delete();
	    		break;
	    		
	    	 case 3://update string
	    		 System.out.println("Enter string delete:");
	    		 String s3=sc.next();
	    		 char []a3=s3.toCharArray();
	    		 
	    		 System.out.println("Enter index:");
	    		 index=sc.nextInt();
	    		 
	    		 StringN sq=new StringN(a,a3,index);
	    		 sq.Update();
	    		break;
	    		
	    	 case 4:
	    		 System.out.println("-----Thank You-----");
	    		 
	    		 default: 
	    			 System.out.println("Invalid choise");
	    	 }
	     }while(ch!=4);
		
	}

}//Driver code ends
