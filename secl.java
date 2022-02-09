import java.util.*;
class secl
{
public static void main(String args[])
	{
	int i,n,large=0,secla=0;
	int []A=new int[100];
	Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of the array:");
	n=obj.nextInt();
	System.out.println("enter the elments:");
       		for(i=0;i<n;i++)
                {
			A[i]=obj.nextInt();
		}
	
		for(i=0;i<n;i++)
                 	if(A[i]>large)
			large=A[i];
	secla=A[0];
	
		for(i=0;i<n;i++)
                 	if(A[i]>secla && A[i]<large)
			secla=A[i];

	System.out.println("second largest element is:"+secla);
	}
}
