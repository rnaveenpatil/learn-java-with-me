import java.util.Stack;
import java.util.Scanner;

public class stack_framework {
    static Stack<Integer> stack= new Stack<Integer>();

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);

        int ch,ele;
        while(true){
        System.out.println("1.push \n 2.pop \n enter your chioce ");
        ch=s.nextInt();
        switch(ch){
            case 1:System.out.println("enter element");
            ele=s.nextInt();
            stack.push(ele);
            System.out.println(stack);
            break;

            case 2:stack.pop();
            System.out.println(stack);
            break;
        }
    }
    
}
}