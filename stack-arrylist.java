import java.util.*;
//stack using array  list
class stack_arrylist{
    //array list constuctor using integer datatypes
static ArrayList<Integer> stack=new ArrayList<Integer>();

//push method adds the elements at the end of array
public static void push(int ele){
stack.addLast(ele);
}

//pop method removes the elements at the end of array
public static int pop(){
if(stack.size()==0){
System.out.println("stack is empty");
return -1;
}
int peek_value=stack.get(stack.size()-1);

System.out.println("the poped element is "+peek_value);
return stack.removeLast();
}

//peek value
public static void peek(){
    System.out.println("the peek element is "+stack.get(stack.size()-1));
}

//main method
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int ele,ch;
while(true){
System.out.println("1.push \n2.pop \npeek \n enter your chioce ");
ch=s.nextInt();


//switch function to  call all the methods
 switch (ch){
case 1:System.out.println("enter element");
ele=s.nextInt();
push(ele);
System.out.println(stack);
break;

case 2:pop();
System.out.println(stack);
break; 

case 3:peek();
break;

}
}
}
}
 
