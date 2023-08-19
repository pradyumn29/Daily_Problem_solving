import java.util.Scanner;

class draw {
	
	public static void DrawSwastik(int size) {
		int mid=0;
		
		if(size%2==0) {
			mid=(size/2);
		}
		else {
			mid=(size/2)+1;
		}
		
	    for(int i=1;i<=mid;i++) {
	    	for(int j=1;j<=size;j++) {
	    		if(j==1 || j==mid ||(j==1 && i>=mid)||i==mid ||(i==1&&j>mid)) {
	    			System.out.print("* ");
	    		}
	    		else {
	    			System.out.print("  ");
	    		}
	    	
	    	}
	    	System.out.println();
	    }
	    
	    for(int i=mid+1;i<=size;i++) {
	    	for(int j=1;j<=size;j++) {
	    		if(j==size || j==mid ||(j==size && i>mid)||i==mid ||(i==size&&j<mid)) {
	    			System.out.print("* ");
	    		}
	    		else {
	    			System.out.print("  ");
	    		}
	    	
	    	}
	    	System.out.println();
	    }
    }
}

public class Swastik {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the size of pattern:");
		int size=sc.nextInt();
	    draw.DrawSwastik(size);
		

	}



}
