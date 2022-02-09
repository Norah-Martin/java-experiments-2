import java.util.*;
class summ
{
public static void main(String args[])
	{
	int m,n,i,j;
	Scanner obj=new Scanner(System.in);
	int a[][]=new int[20][20];
	int b[][]=new int[20][20];
	int sum[][]=new int[20][20];
        System.out.println("enter the number of rows: ");
        m=obj.nextInt();
	System.out.println("enter the number of columns: ");
        n=obj.nextInt();
	System.out.println("enter the first matrix: ");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				a[i][j]=obj.nextInt();
	System.out.println("enter the second matrix: ");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				b[i][j]=obj.nextInt();
	

	for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				sum[i][j]=a[i][j]+b[i][j];
				
	System.out.println("resultant matrix is:\n");
              		for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
					System.out.print(sum[i][j]);
					System.out.println("");
			}
	}
}



	
