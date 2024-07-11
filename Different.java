import java.util.*;
class Different 
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int a,b,c,sum,avg,r;
System.out.println("Enter The Values Of a,b,c");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
sum=a+b+c;
avg=sum/3;
r=sum-avg;
System.out.println(r);
}
}