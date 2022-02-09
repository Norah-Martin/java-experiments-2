import java.util.*;
class larray
{
public static void main(String args[])
	{
	int m,n,i,j,large;
	Scanner obj=new Scanner(System.in);
	int a[][]=new int[20][20];
        System.out.println("enter the number of rows: ");
        m=obj.nextInt();
	System.out.println("enter the number of columns: ");
        n=obj.nextInt();
	System.out.println("enter the matrix: ");

		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				a[i][j]=obj.nextInt();
	large=a[0][0];
	for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				if(a[i][j]>large)
				large=a[i][j];
	System.out.println("largest number in matrix is :"+large);
	}
}



	
