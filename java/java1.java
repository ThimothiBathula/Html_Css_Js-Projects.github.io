import java.io.*;
import java.util.*;
class stu
{
	private String name;
	private double m1,m2,m3;
	void readneme()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter name:");
		name=s.nextLine();
	}
	void readmarks()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter subject1 marks m1:");
		m1=s.nextDouble();
		System.out.println("enter subject2 marks m2:");
		m2=s.nextDouble();
		System.out.println("enter subject3 marks m3:");
		m3=s.nextDouble();
	}
	void display()
	{
		double avg=(m1+m2+m3)/3;
		System.out.println("name:"+name);
		System.out.println("marks:"+m1+" "+m2+" "+m3);
		System.out.println("average:"+avg);
}
}

