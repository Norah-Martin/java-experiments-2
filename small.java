import java.util.*;
class small
{
public static void main(String args[])
	{
	int i,n,small;
	int []A=new int[100];
	Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of the array:");
	n=obj.nextInt();
	System.out.println("enter the elments:");
       		for(i=0;i<n;i++)
                {
			A[i]=obj.nextInt();
		}
	small=A[0];
		for(i=0;i<n;i++)
                 	if(A[i]<small)
			small=A[i];

	System.out.println("smallest element is:"+small);
	}
}
