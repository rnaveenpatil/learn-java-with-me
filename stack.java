import java.util.*;
//code for stack this is FIFO data stuctur
//stack class
public class stack{
static int top=-1;

//to push element in stack
public static void push(int val , int[] stack, int n){
if(top==n-1){
System.out.println("stack over flow ");
return;
}
top++;
stack[top]=val;
display(stack);
}

//to pop an element in stack
public static int pop(int[] stack){
if(top==-1){
System.out.println("Stack is empty");
return -1;
}
System.out.println("poped "+stack[top]);
top--;
return stack[top];

}

//to display the elements in stack
public static void display(int[] stack){
for(int i=0; i<top; i++){
System.out.print(stack[i]+",\n");
}
}
//the man function 
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int[] stack;
System.out.println("enter size of statck");
int n=s.nextInt();
stack=new int[n];

int ch,ele;
while(true){
System.out.println("1.push \n 2.pop\n 3.peek\n enter choice ");
ch=s.nextInt();

switch(ch){
case 1:System.out.println("enter ele");
ele=s.nextInt();
push(ele,stack,n);
break;

case 2: pop(stack);
break;

case 3:System.out.println("the peek element is "+stack[top]);
break;
}
}
}
}

