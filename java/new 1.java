import java.io.*;
import java.util.*;
class a
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter String");
		String str=s.nextLine();
		String st="";
		for(int i=str.length-1();i>=0;i--)
		{
			st=st+str[i];
		}
		if(st==str)
		{
			System.out.println("done");
		}
		else
		{
			System.out.println("not done");
		}
	}
	
}

			
		