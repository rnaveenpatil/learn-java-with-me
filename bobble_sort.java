import java.util.*;
public class sort{
static int n=5;
public static int[] sorting(int[] a){
System.out.println("the sorted arry is ");

for(int i=0; i<a.length-1; i++){
for(int j=0; j<a.length-i-1; j++){
if(a[j]>a[j+1]){
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
return a;
}

public static int[] display(int[] b){

for(int k=0; k<b.length; k++){
System.out.println(b[k]);
}
return b;
}

public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter elements in arry ");
int[] c=new int[n];
int[] d=new int[n];
for(int l=0; l<c.length; l++){
c[l]=s.nextInt();

}
System.out.println("the entered array is :");

display(c);
d=sorting(c);
display(d);
}
}

