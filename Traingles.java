/*Write a program to enter the three sides of a triangle. Decide whether it is a scalene, isosceles or
equilateral triangle*/
import java.util.*;
class Traingles
{
public static void main (String args[])
{
Scanner sc = new Scanner(System.in);
int a,b,c;
System.out.println("Enter The Values a,b,c ");
a=sc.next vfvfInt();
b=sc.nextInt();
c=sc.nextInt();
if (a==b && b==c && a==c)
{
System.out.println("It Is Equilateral Traiangle");
}
else if(a==b || b==c || a==c)
{
System.out.println("It Is Isosceles Traiangle");
}
else
{
System.out.println("It Is Scalene");
}
}
}
