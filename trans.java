import java.util.*;
class trans
{
public static void main(String args[])
	{
	int m,n,i,j;
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
	

	
        System.out.println("transpose matrix ");
	for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				{
					System.out.print(a[j][i]);
					System.out.println(" ");
			         }

	}
}

