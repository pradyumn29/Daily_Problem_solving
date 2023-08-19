import java.util.Scanner;
import static java.lang.Math.pow;
public class ArmStrong {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		int digit=0;
		int sum=0;
		int flag = num;
		int temp=num;
		int count=0;
		while(temp>0) {
			digit=temp%10;
			temp=temp/10;
			count++;	
		}
		System.out.println(count);
		while(num>0) {
		digit=num%10;
		sum+=pow(digit,count);
		num=num/10;
		//System.out.println(sum);
		}
		
		if(flag==sum) {
			System.out.println("it is armstrong");
		}
		
		

	}

}
