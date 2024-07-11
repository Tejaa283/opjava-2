import java.util.*;
class Salesman
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
   int sales;
   float comission_amount,rate_of_commission;
System.out.println("Enter The Sales");
   sales = sc.nextInt();
if ((sales>=0) && (sales<=20000))
{
   comission_amount = (sales*3.0f)/100;
   rate_of_commission = (comission_amount/sales)*100;
    System.out.println(comission_amount);
    System.out.println(rate_of_commission);
}

else if ((sales>=20000) && (sales<=50000))
{
     comission_amount = (sales*12.0f)/100;
     rate_of_commission = (comission_amount/sales)*100;
System.out.println(comission_amount);
    System.out.println(rate_of_commission);
}
else
{
     comission_amount = (sales*31.0f)/100;
     rate_of_commission = (comission_amount/sales)*100;
System.out.println(comission_amount);
    System.out.println(rate_of_commission);
}

}
}