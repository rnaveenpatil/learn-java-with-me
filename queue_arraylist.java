import java.util.ArrayList;
import java.util.Scanner;


//queue using arraylist
public class queue_arraylist {

    //constructor for array list 
   static ArrayList<Integer> queue=new ArrayList<Integer>();

   //instrting the elements in the queue 
    public static void insert(int ele){
    queue.addLast(ele);
    System.out.println(queue);
}


//deleteing the elements at the beginig of the array
public static void delete(){
    if(queue.size()==0){
        System.out.println("Queue is empty");
        return;
    }
     queue.removeFirst();
System.out.println(queue);
}



//main method
public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int ch,ele;
    while(true){
    System.out.println("1.insert \n 2 delete \n enter your chice ");
    ch=s.nextInt();
    //switch funtction to call all the mothod
    switch(ch){
        case 1:System.out.println("enter ele");
        ele=s.nextInt();
        insert(ele);
        break;

        case 2:delete();
        break;

    }

}
}
}