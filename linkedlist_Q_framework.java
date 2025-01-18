//implanting queue using linked list class

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class linkedlist_Q_framework {
    public static void main(String args[]){

        //constuctor for the queue in linked list class
        Queue<Integer> q=new LinkedList<>();
        Scanner s=new Scanner(System.in);

        int ch,ele;
        while(true){
        System.out.println("1.insert \n 2.delete \n enter your choice ");
        ch=s.nextInt();
        switch(ch){
            case 1:System.out.println("enter ele ");
            ele=s.nextInt();
            q.add(ele);
            System.out.println(q);
            break;

            case 2:q.remove();
            System.out.println(q);
            break;

        }


    }
    
}
}