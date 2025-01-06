import java.util.*;
public class sort{
public static int[] selsort(int[] a){
for(int i=0; i<a.length-1; i++){
for(int j=i+1; j<a.length; j++){
int small=i;
if(a[i]>a[j]){
small=j;
}
int temp=a[small];
a[small]=a[j];
a[j]=temp;

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
System.out.println("enter the arry size ");
int n=s.nextInt();
int[] d=new int[n];
int[] f=new int[n];

System.out.println("enter the arry elements ");
for(int g=0; g<d.length; g++){
d[g]=s.nextInt();
}
System.out.println("the entered arry is ");
display(d);
System.out.println("the entered arry is ");
f=selsort(d);
display(f);
}
}
