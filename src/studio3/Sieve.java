package studio3;

import java.util.Scanner;

public class Sieve {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
System.out.println("Enter value for n");
int n = in.nextInt();
boolean[] prime;
int i=0;
prime =  new boolean [n];
for(i=0;i<n;i++)
	if (i==2|| i==3 || i==5 || i==7)
	{
		System.out.println(i);
	}
	else
	{
	if (i%2==0 || i%3==0 || i%4==0 || i%5==0 ||i%7==0 || i==1)
	{
		prime[i]=false;
	}
	else
	{
		System.out.println(i);
	}
}
	}
	}	


