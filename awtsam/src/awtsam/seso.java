package awtsam;
import java.util.*;
public class seso 
{
		public void selectsort(int n,int a[])
		{
			for(int i=0;i<=n-1;i++)
			{
				int m=i,temp;
				for(int j=i+1;j<n;j++)
				{
					if(a[j]<a[m])
					{
						m=j;
					}
				}
				System.out.print("pass "+i+" ");
				System.out.println(m);
				if(m!=i)
				{
					temp=a[i];
					a[i]=a[m];
					a[m]=temp;
					System.out.print("sorted "+a[i]+" ");
					System.out.println(a[m]);
				}
			}
			for(int i=0;i<=n-1;i++)
			{
				System.out.print(a[i]+" ");
		    }
		}
		public static void main(String args[])
		{
			seso obj=new seso();
			Scanner s=new Scanner(System.in);
			System.out.println("enter n");
			int n=s.nextInt();
			int a[]=new int[]{7,4,10,8,3,1};
			obj.selectsort(n,a);
		}
	}



