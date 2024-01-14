import java.io.*;
import java.util.*;
// // // import java.Arrays;
class a
{
	public static void main(String args[])
	{
		String[] array={"apple","orange","Banana","Grapes","Cherry"};
		Arrays.sort(array);
		System.out.println("Sorted array:");
		for(String e:array)
		{
			System.out.println(e);
		}
	}
}