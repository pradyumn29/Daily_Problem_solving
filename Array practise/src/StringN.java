package daily;
import daily.StringUpdation;
public class StringN {
	
	public char []old;
	public char []updt;
	public char []New;
	public int Index;
	
	public StringN(char Org[],char a[],int i)
	{
		old=Org;
		New=a;
		Index=i;
		updt=new char[Org.length+a.length];
	}

	public void Add()
	{
		for(int i=0;i<old.length;i++)
		{
			updt[i]=old[i];
		}
		for(int i=0;i<New.length;i++)
		{
			updt[Index]=New[i];
		}
		for(int i=0;i<updt.length;i++)
		{
		  System.out.print(updt[i]);
		}
	}
	
	public static String insertString(String originalString, String stringToInsert, int index) {
	    String newString = originalString.substring(0, index) + stringToInsert + originalString.substring(index);
	    return newString;
	}

}
