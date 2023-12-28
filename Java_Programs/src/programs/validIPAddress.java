package programs;

import java.util.Scanner;

public class validIPAddress {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the IP Address");
		String s=sc.next();
		String s1="";
		int count=0;
		int i=0;
		for (int j = 0; j < s.length(); j++) {
			if(s.charAt(j)=='.')
			{
				count++;
			}
		}
		if (count!=3)
		{
			System.out.println("It is an invalid IP Address");
			return;
		}
		else
		{
			for(i=0;i<s.length();i++)
			{
				if(s.charAt(i)!='.')
				{
					s1+=s.charAt(i);
				}
				else
				{
					int a=Integer.parseInt(s1);
					s1="";
					if (a>=0&&a<255) {
						continue;
					} else {
						System.out.println("It is an invlaid IP Address");
						return;
					}
				}
			}
		}
		if(i==s.length())
		{
			System.out.println("It is a valid IP Address");
		}
	sc.close();
	}
}
