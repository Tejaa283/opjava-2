/*The telephone department wishes to compute monthly telephone bills for its customers using the
following rules. Minimum Rs. 250 for first 80 message units, plus 60 paise per unit for next 60 units,
plus 50 paise per unit for next 60 units, plus 40 paise per unit for any units above 200. Write a
program that calculates the monthly bill, with input MESSAGE (the number of message units) and
CUSTNO (the registration number of a customer). Then Display the bill in following format.
 CUSTOMER NO :
 MESSAGE UNITS :
 AMOUNT (Rs.) :*/
import java.util.*;
class Telephonebills
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int msg_units, cust_no;
float  amount;
System.out.print("Enter The Value Of cust_no");
cust_no=sc.nextInt();
System.out.print("Enter The Value Of msg_units");
msg_units=sc.nextInt();
if (msg_units>=0 && msg_units<=80)
{
amount=250;
}
else if(msg_units>80 && msg_units<=140)
{
amount=250+(msg_units-80)*0.6f;
}
else if (msg_units>140 && msg_units<=200)
{
amount=250+(60*0.6f)+(msg_units-140)*0.5f;
 
}
else
{
amount=250+(60*0.6f)+(60*0.5f)+(msg_units-200)*0.4f;
}
System.out.println("amount" +=amount);
}
}