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
{
	if (i%2==0 || i%3==0 || i%4==0 || i%5==0 ||i%7==0)
	{
		prime[i]=false;
	}
	else
	{
		prime[i] = true;
		System.out.println(i);
	}
}
	}
	
}

