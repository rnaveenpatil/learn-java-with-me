import java.util.*;
public class factorial{
public static int fact(int n){
int f_1,ff;
if(n==0||n==1){

return 1;
}
f_1=fact(n-1);
ff=f_1*n;

return ff;
}
public static void disfact(int ff){
System.out.println("the factoreal is "+ff);
}

public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter number n");
int f=s.nextInt();
int g;
g=fact(f);
disfact(g);
}}

