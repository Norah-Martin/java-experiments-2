import java.util.*;
class palindrome
{j
public static void main(String args[])
{
 int n,rev,rem,orginalsum;
rev=0;
System.out.println("enter a number:");
Scanner obj=new Scanner(System.in);
n=obj.nextInt();

orginalsum=n;
while(n!=0)
{
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
if(orginalsum==rev)
System.out.println("the number is a palindrime");
else 
System.out.println("the number not palindrome");
}
}
