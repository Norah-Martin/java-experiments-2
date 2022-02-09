import java.util.*;
class replace
{
public static void main(String args[])
	{
	int i,n,b,d;
	int []A=new int[100];
	Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of the array:");
	n=obj.nextInt();
	System.out.println("enter the elments:");
       		for(i=0;i<n;i++)
                {
			A[i]=obj.nextInt();
		}
	System.out.println("enter the element to be replaced :");
	b=obj.nextInt();
	System.out.println("enter the element to be placed :");
	d=obj.nextInt();
		for(i=0;i<n;i++)
                 	if(A[i]==b)
			A[i]=d;
 	for(i=0;i<n;i++)
	System.out.println(A[i]);
	}
}
