package awtsam;
import java.util.*;
class test
{
	public void pat(int n)
	{
		int sq=(n*n)+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n*2;j++)
			{
				if(j<=3)
				{
					System.out.print(j*10);
				}
				else
				{
					System.out.print(sq*10);
					sq++;
				}
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		test obj=new test();
		Scanner s=new Scanner(System.in);
		System.out.println("enter n");
		int n=s.nextInt();
		obj.pat(n);
	}
}

