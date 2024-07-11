import java.util.*;
class Duplicate
{
public static void main(String args[]){
int i,j,count=0;
 int n=0;
int a[]= {78,77,78,17,71,17,78};
for(i=0; i<a.length; i++){

	for(j=i+1;j<a.length; j++){

		if(a[i] == a[j]){
			//System.out.println(a[i]+", ");
			
                          count++;
			a[j]=n;
                         break;        }

	}
    if (count>=1 ){
      break;
    System.out.println(a[i]+", ");}
}
}
}