import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;


//queue using arraydeue class 
public class deque_arry {

    public static void main(String args[]){

        //consructor for the Queue arrayDeque class 
    Queue<Integer> dq=new ArrayDeque<Integer>();
    Scanner s=new Scanner(System.in);

int ch,ele;
while(true){
System.out.println("1.insert \n 2.delete \n enter your choice ");
ch=s.nextInt();
switch(ch){
    case 1:System.out.println("enter ele ");
    ele=s.nextInt();
    dq.add(ele);
    System.out.println(dq);
    break;

    case 2:dq.remove();
    System.out.println(dq);

    break;
}
}
    }
}