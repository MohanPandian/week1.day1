package week1day1;

public class PrimeNumber {
	
	public static void main(String args[]){   

	int m=0;
	int flag = 0;
	int input = 14;
	m=input/2;
	
   for(int i = 2;i<=m;i++)
	{
		if (input % i == 0)
			flag = 1;
		break;
	}
   if(flag==0)
	{
		System.out.println(input + " is prime number");
	}else
	{
		System.out.println(input + " is not a prime number");
	}
}}