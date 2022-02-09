import java.util.*;
class trace
{
public static void main(String args[])
	{
	int m,i,j,sum=0;
	Scanner obj=new Scanner(System.in);
	int a[][]=new int[20][20];
	
        System.out.println("enter the number of rows(=columns): ");
        m=obj.nextInt();
	
  
	System.out.println("enter the matrix: ");  
		for(i=0;i<m;i++)
			for(j=0;j<m;j++)
				a[i][j]=obj.nextInt();
	

	
     
	for(i=0;i<m;i++)
		
			for(j=0;j<m;j++)
				if(i==j)
					{
					sum=sum+a[i][j];
					}

					System.out.print("the trace is :"+sum);
					System.out.println(" ");
			                 

	}
}

