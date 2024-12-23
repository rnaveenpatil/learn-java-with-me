import java.util.*;
public class ma{
public static int[][] input(int[][] a,int n){
Scanner s=new Scanner(System.in);
System.out.println("enetr elements in matrix");
for(int i=0; i<n; i++){
for(int j=0; j<n; j++){
a[i][j]=s.nextInt();
}
}
return a;
}
public static int[][] pl(int[][] b,int n){
//Syatem.out.println("the result");
for(int i=0; i<n; i++){
for(int j=0; j<n; j++){
System.out.print(b[i][j]+" ");
}
System.out.println();
}
return b;
}
public static int[][] mul(int[][] x, int[][] y, int n){
int[][] z=new int[n][n];
for(int i=0; i<n; i++){
for(int j=0; j<n; j++){
z[i][j]=0;
for(int k=0; k<n; k++){
z[i][j]+=x[i][k]*y[k][j];

}
}


}
return z;
}
public static void main(String args[]){
int n=2;
int[][] p=new int[n][n];
int[][] q=new int[n][n];
int[][] r=new int[n][n];
input(q,n);
input(p,n);
System.out.println("the frist matrix");
pl(p,n);
System.out.println("the second matrix ");
pl(q,n);
System.out.println("the result is ");
r=mul(p,q,n);
pl(r,n);
}
}
