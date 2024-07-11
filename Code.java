/*6. Write a program to input the code of a particular item, quantity purchased and rate. Then calculate
the purchased price and print it along with gift to be presented. The gifts to the customers are given
in the following manner:
 Amount of Purchase (Rs.) Gift
 Between 100 to 500 A key ring
 Between 500 to 1000 A leather purse
 Above 1000 A pocket calculator*/
import java.util.*;
class Code
{
public static void main (string args[])
{
Scanner sc=new Scanner(System.in);
int rate,quantity,item_code,purchased_price;