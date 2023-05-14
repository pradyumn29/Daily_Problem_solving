
import java.util.*;

class CheckString
{
	public void Operation(char []c1,char []c2)
	{
		int counter=0;
		for(int i=0;i<c1.length;i++)
		{
			for(int j=0;j<c2.length;j++)
			{
				if(c1[i]==c2[j])
				{
					counter++;
					break;
				}
			}
		}
		if(c1.length==c2.length)
		{
			if(c1.length==counter)
			{
				System.out.println("it is anagram");
			}
			else
			{
				System.out.println("it is not anagram");
			}
		}
		else
		{
			System.out.println("it is not anagram");
		}
	}
}

public class Anagram {
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string1:");
		String str1=sc.nextLine();
		
		System.out.println("Enter string2:");
		String str2=sc.nextLine();
		
		//string to array conversion
		char []c1=str1.toCharArray();
		char []c2=str2.toCharArray();
		
		CheckString cs=new CheckString();
		
		cs.Operation(c1,c2);
		

	}


}
