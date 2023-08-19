import java.util.Scanner;

//class Unique{
//	
//	public static void element(int arr[]) {
//		
//		int counter=0;
//		int ArrCount[]=new int[arr.length];
//		
//		for(int  i=0;i<arr.length;i++) {
//			counter=0;
//			for(int j=0;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					counter++;
//				}
//				//System.out.println(counter);
//			}
//			ArrCount[i]=counter;
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			if(ArrCount[i]==1) {
//				System.out.println("unique elemnt is:"+arr[i]);
//			}
//		}
//	}
//}

public class UniqueElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of Aray:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter elem in array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int counter=0;
		
		for(int  i=0;i<a.length;i++) {
			counter=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					counter++;
				}
				System.out.println(counter);
			}
			if(counter==0) {
				System.out.println("unique elem:"+a[i]);
			}
		}
	}

}
