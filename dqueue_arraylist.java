import java.util.ArrayList;
import java.util.Scanner;

//dqueue using arraylist
public class dqueue_arraylist {

    //static construtor for arraylist 
    static ArrayList<Integer> dqueue=new ArrayList<Integer>();


   //static constructor for scanner
   static Scanner s=new Scanner(System.in);


//insert at end and frant
  public static void insert_at(int ele){
    
    System.out.println("1.isert at frant\n 2. insert at last\n enter your choice ");
    int ch=s.nextInt();
    switch(ch){
        case 1:dqueue.addFirst(ele);
        System.out.println(dqueue);
        break;

        case 2:dqueue.addLast(ele);
        System.out.println(dqueue);
        break;


    }
  }
//delete at frant and end 
  public static void delete_at(){
    System.out.println("1.delete at frant \n 2.delete at end \n enter your choice ");
int ch=s.nextInt();
    switch(ch){
        case 1:dqueue.removeFirst();
        System.out.println(dqueue);
        break;

        case 2:dqueue.removeLast();
        System.out.println(dqueue);
        break;

    }

  }


    public static void main(String args[]){
        int ch,ele;
        Scanner s=new Scanner(System.in);
        while(true){
        System.out.println("1.insert\n 2.delete\n enter your choice ");
        ch=s.nextInt();
        switch(ch){
            case 1:System.out.println("enter element ");
            ele=s.nextInt();
            insert_at(ele);
            break;

            case 2:delete_at();
            break;
        }
    }
    }
    
}
