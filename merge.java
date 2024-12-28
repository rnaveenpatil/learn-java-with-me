import java.util.*;
class mergsort{
public static int[] merge(int[] a, int[] b){
int[] c =new int[a.length+b.length];
for(int i=0; i<a.length; i++){
c[i]=a[i];
}
for(int j=0; j<a.length; j++){
c[j+a.length]=b[j];
}
return c;
}

public static int[] sort(int[] sr){
for(int k=0; k<sr.length-1; k++){
for(int l=0; l<sr.length-k-1; l++){
if(sr[l]>sr[l+1]){
int t=sr[l];
sr[l]=sr[l+1];
sr[l+1]=t;
}
}
}
return sr;
}
 
 public static int[] display(int[] d){
 System.out.print("[");
 for(int q=0; q<d.length; q++){
 System.out.print(d[q]+"  ");
 }
 System.out.print("]");
 System.out.println();
 
 return d;
 }
 
 public static void main(String args[]){
 Scanner s=new Scanner(System.in);
 int e,f;
 System.out.println("enter first array length");
 e=s.nextInt();
 System.out.println("enter second array length ");
 f=s.nextInt();
 int[] fa=new int[e];
 int[] sa=new int[f];
 int[] ma=new int[e+f];
 int[] dma=new int[e+f];
  
  System.out.println("enter first array elements ");
  for(int i=0; i<fa.length; i++){
  fa[i]=s.nextInt();
  }
  System.out.println("enter second array elements ");
  for(int j=0; j<sa.length; j++){
  sa[j]=s.nextInt();
  }
  
  System.out.println("the merged array is ");
 ma= merge(fa,sa);
 display(ma);
 
 System.out.println("the sorted array is ");
 dma=sort(ma);
 display(dma);
 }
 }
 
