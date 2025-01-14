import java.util.*;
//Queue class 
class queue{
static int frant=0;
static int rear=-1;

//to insert element in queue
public static void insert(int[] q, int ele,int n){
if(rear==n){
System.out.println("queue is full");
return;
}
rear++;
q[rear]=ele;
display(q);
}

//to delete the element in queue
public static void delete(int[] q){
if(frant==rear){
System.out.println("on elements");
return;
}
frant++;
display(q);
}

//to display the queue
public static void display(int[] q){
if(rear==-1){
System.out.println("q is empty");
return;
}

int i=frant;
while(i<=rear){
System.out.print(q[i]+",");
i++;
}
}

//main function 
public static void main(String args[]){
Scanner s= new Scanner(System.in);
System.out.println("enter size of q"); 
int n=s.nextInt();
int[] q=new int[n];
int ch,ele;
while(true){
System.out.println("1.insret\n 2.delete. \n 3.display\nenter your choice ");
ch=s.nextInt();


//switch function that calls all the functions
switch(ch){
case 1: System.out.println("enter element");
ele=s.nextInt();
insert(q,ele,n);
break;

case 2:delete(q);
break;

case 3:display(q);
break;

}
}
}
}



