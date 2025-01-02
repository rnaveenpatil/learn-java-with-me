import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class array{

public static void main(String args[]){
ArrayList<Integer> list=new ArrayList<Integer>();


//list.add
//objact.add(integer)  for adding the elements in list
list.add(8);
list.add(7);
list.add(9);
list.add(3);
list.add(20);
System.out.println("the initial array is "+list);


//list.get
System.out.println("\n");
//object.get(index)  for get the elements in given index
int ele=list.get(4);
System.out.println("the popped element is "+ele);


System.out.println("\n");
//to add an element in between  array
//object.add(index,integer);
//index=index where we want to add element
//integer=which element we want to add
list.add(0,67);
System.out.println("added element array");
System.out.println(list);


//list.get(index,integer);
System.out.println("\n");
//to change an element in between array we use set
//object.set(index,integer);
//index=at which index we want to change the element
// integer= element we want to replace
list.set(1,69);
System.out.println("the changed element at index 1 \n "+list);


//list.remove(index);
System.out.println("\n");
//to delete an element we use remove
//object.remove(index);
//index=index if the element we want to remove
list.remove(1);
System.out.println("element removed \n"+list);


//list.size();
System.out.println("\n");
//to determine the size of an array we use size
//object.size();
int size=list.size();
System.out.println("the size of array is   "+size);


System.out.println("\n");
//usage of loops in array list
//1.usage of for loop
for(int i=0; i<list.size(); i++){
System.out.print(list.get(i)+",");
}


//sort array
System.out.println("\n");
//to sort array in assending order we use class Collections & sort funtion
//import Collection class
//import java.util.Collections;
//Collection.sort(object);
Collections.sort(list);
System.out.println("the sorted array is \n"+(list));
}
}


