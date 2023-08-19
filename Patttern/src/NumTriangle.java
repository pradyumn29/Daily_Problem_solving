import java.util.Scanner;

public class NumTriangle {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the size:");
	   int size=sc.nextInt();
	   int mid=(size/2)+1;
	    
	   char A ='a';
	   int a=1;
	  
	   for(int i=1;i<=size;i++) {
		   for(int k=i;k<size;k++) {
			   System.out.print(" ");
		   }
		   for(int j=1;j<=i;j++) {
			   System.out.print(i+" ");
		   }
		  
		  System.out.println();
		  
	   }
	   System.out.println("-----------------------------");
	   for(int i=1;i<=size;i++) {
		   for(int k=i;k<size;k++) {
			   System.out.print(" ");
		   }
		   for(int j=1;j<=i;j++) {
			   System.out.print((A++)+" ");
		   }
		  
		  System.out.println();
		  
	   }
	   
	   System.out.println("-----------------------------");
	   
	   for(int i=1;i<=size;i++) {
		   int z=1;
		   for(int k=i;k<size;k++) {
			   System.out.print(" ");
		   }
		   for(int j=1;j<=i;j++) {
			   System.out.print((z++)+" ");
		   }
		  
		  System.out.println();
		  
	   }
	   System.out.println("-----------------------------");
	   
	   for(int i=1;i<=size;i++) {
		   
		   for(int k=i;k<size;k++) {
			   System.out.print(" ");
		   }
		   for(int j=1;j<=i;j++) {
			   System.out.print((a++)+" ");
		   }
		  
		  System.out.println();
		  
	   }
	   System.out.println("-----------------------------");
	   for(int i=1;i<=size;i++) {
		   for(int k=size-1;k>0;k--) {
			   System.out.print("* ");
		   }
		   for(int j=i;j<=i;j++) {
			   System.out.print(1+" ");
		   }
		  
		  System.out.println();
		  
	   }

	}

}
