import java.util.*;
//pivot & partition approch
//
public class Quick_sort{
public static int partition(int arr[],int low,int high){
int pivot=arr[high];    //take pivot element is last arry element
int i=low-1;
for(int j=low; j<=high; j++){
if(arr[i]<pivot){
i++;
//swaping two elements
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}

//swap with pivot and arry element
i++;
int temp_2=arr[i];
arr[i]=arr[high];//pivot
arr[high]=temp_2;
}
return i;
}



public static  int[] quicksort(int[] arr, int low, int high){

if(low<high){
int pivot_idx=partition(arr,low,high);
quicksort(arr,low,pivot_idx-1);
quicksort(arr,pivot_idx+1,high);

}
return arr;
}

public static void display(int[] arr){
System.out.print("\n[");
for(int i=0; i<arr.length; i++){
System.out.print(arr[i]);
}
System.out.print("]\n");
}

public static void main(String args[]){
Scanner s=new Scanner(System.in);

System.out.println("enter size of arr");
int size=s.nextInt();
int[] arr_1=new int[size];
int[] result=new int[size];

System.out.println("enter elements of arry");
for(int i=0; i<size; i++){
arr_1[i]=s.nextInt();
}
int low=0; 
int high=size-1;
//partition(arr_1,low,high);
result=quicksort(arr_1,low,high);
display(result);
}
}




