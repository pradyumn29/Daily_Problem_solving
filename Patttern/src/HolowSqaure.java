import java.util.Scanner;

public class HolowSqaure {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int size=sc.nextInt();
	
	for(int i=0;i<size;i++) {
		for(int j=0;j<size;j++) {
			if(i==0 || j==0 || i==(size-1)||j==(size-1)) {
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
