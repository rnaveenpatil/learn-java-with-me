import java.util.*;
public class fibunacci{
public static void fibb(int n,int a,int b){
 
if(n==0){
return ;
}
int c=a+b;

System.out.print(c+" ");
fibb(n-1,b,c);
}

public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter number f ");
int f=s.nextInt();
fibb(f-2,0,1);
}
}
