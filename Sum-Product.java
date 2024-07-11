import java.util.*;

Class Sum-Product
{
public static void main (String args[])
{
Scanner Sc = new Scanner(System.in);
int i,n,num1,num2,sum=0,prod=1;
System.out.print("Enter the value of n");
n=sc.nextInt();
while(i>n)
{
System.out.println("Enter the values of num1,num2");
num1=sc.nextInt();
num2=sc.nextInt();
sum=sum+i;
prod=prod*i;
i++;
}
System.out.println("sum="+sum);
{
System.out.println("prod="+prod);
}
}
}