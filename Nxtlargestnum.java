
import java.util.*;
class Nxtlargestnum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,nxtlargernumber,rem,temp,digit;
boolean flag;
System.out.println("Enter The Value Of n");
n=sc.nextInt();
System.out.println("enter digit");
digit=sc.nextInt();
nxtlargernumber=n-1;
while(nxtlargernumber>0)
{
	temp=nxtlargernumber;
	flag=false;
	while(temp>0)
	{
		rem=temp%10;
		if (rem==digit)
		{
			flag=true;
			break;
		}
		temp=temp/10;
	}
	if(!flag)
		break;
	nxtlargernumber--;
}
if(nxtlargernumber>0)
System.out.println(nxtlargernumber);
else
System.out.println("no such number exits");
}
}
