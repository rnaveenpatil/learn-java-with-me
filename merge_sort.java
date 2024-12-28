//divide and conquer
import java.util.*;

public class merge_sort{
public static int[] divide(int[] arr,int start_idx, int end_idx){
if(start_idx>=end_idx){
return arr;
}
int mid=start_idx+(end_idx-start_idx)/2;  //or you can use  mid= (start_idx+end_idx)/2;
divide(arr,start_idx,mid);
divide(arr,mid+1,end_idx);
merge(arr,start_idx,end_idx,mid);
return arr;
}

public static int[] merge(int[] arr,int start_idx,int end_idx,int mid){
int[] conquer=new int[(end_idx-start_idx)+1];
int idx_1=start_idx;
int idx_2=mid+1;
int x=0;

while(idx_1<=mid  && idx_2<=end_idx){
if(arr[idx_1]<=arr[idx_2]){
conquer[x]=arr[idx_1];
idx_1++;
x++;
}
else if(arr[idx_1]>=arr[idx_2]){
conquer[x]=arr[idx_2];
idx_2++;
x++;
}
}
while(idx_1<=mid){
conquer[x]=arr[idx_1];
x++;
idx_1++;
}
while(idx_2<=end_idx){
conquer[x]=arr[idx_2];
x++;
idx_2++;
}
int i,j;
for( i=0, j=start_idx; i<conquer.length;  i++,j++){
arr[j]=conquer[i];
}
return conquer;
}

public static int[] merge_sort(int[] arr,int start_idx,int end_idx){
int[] ans=new int[(end_idx-start_idx)+1];
ans=divide(arr,start_idx,end_idx);

System.out.print("\n[");
for(int i=0; i<(end_idx-start_idx)+1; i++){
System.out.print(ans[i]+",");
}
System.out.print("]\n");

return ans;
}

public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enetr size of arry");
int size=s.nextInt();
int[] arr=new int[size];

System.out.println("enter the elements in arry");
for(int i=0; i<size; i++){
arr[i]=s.nextInt();
}
int start_idx=0;
int end_idx=size-1;
merge_sort(arr,start_idx,end_idx);


}
}


