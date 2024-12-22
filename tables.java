import java.util.*;
public class table{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter no n  :");

int n=s.nextInt();

for(int i=0; i<=10; i++){
int t=i*n;
System.out.println(n+" * "+i+" = "+t);
}
}
}

