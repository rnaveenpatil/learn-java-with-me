import java.util.*;
public class insort{

public static int[] sel(int[] a){
for(int i=0; i<a.length; i++){
int cur=a[i];
int j=i-1;
while(j>=0 && cur<a[j]){
a[j+1]=a[j];
j--;
}
a[j+1]=cur;
}
return a;
}
public static int[] display(int[] b){
for(int k=0; k<b.length; k++){
System.out.println(k);
}
return b;
}

public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter arry size ");
int n=s.nextInt();
int[] h=new int[n];
int[] g=new int[n];
System.out.println("enter elements in the arrry   ");
for(int l=0; l<h.length; l++){
h[l]=s.nextInt();
}

g=sel(h);
System.out.println("the sorted array ");
display(g);
}

}

