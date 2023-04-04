import java.util.Scanner;
class HappyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Ente Number : ");
		int ip = sc.nextInt();

		while(true)
		{
			ip = checkHappyno(ip);

			if(ip==1 || ip==4)
			{
				break;
			}
		}

		if(ip == 1)
		{
			System.out.print("It's happy number ");
		}
		else
		{
			System.out.println("It's an unhappy number ");
		}

	}

	public static int checkHappyno(int num)
	{
		int sum = 0;
		while(num > 0)
		{
			int rem = num % 10;
			int sq = rem * rem;
			sum = sum + sq;
			num = num/10;
		}

		return sum;
	}
}
