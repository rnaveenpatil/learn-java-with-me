
//reversing the given linked list 
class ll{
//creating the node class
class node{
    int data;
    node link;
    node(int data){
        this.data=data;
        this.link=null;
    }
}
//initilising head node
node head;
//add element at frount 
public void addfrount(int data){
    node temp=new node(data);
    if(head==null){
        head=temp;
    }
    head=temp.link;
head=temp;
    
}

// add element at end of list
public void addend(int data){
    node temp=new node(data);
    node cur=head;
    while(cur.link!=null){
        cur=cur.link;
    }
    cur.link=temp;
    
}
//to display the liked list
public void display(){
    node cur=head;
    if(head==null){
        System.out.println("list does't exist ");
    }

    while(cur!=null){
        System.out.print(cur.data+"->");
        cur=cur.link;
    }
}
// to revers a linked list
public void revers(){
    if(head==null || head.link==null){

    }
    node prev=head;
    node cur=prev.link;

    while(cur!=null){
        node next=cur.link;
        
        cur.link=prev;

        prev=cur;
        cur=next;
    }
    head.link=null;
    head=prev;
   
}

public static void main(String args[]){
    ll list= new ll();
    //adding the elements in the list
    list.addfrount(34);
    list.addfrount(45);
    list.addend(89);
list.addend(35);
list.addend(12);
System.out.println();
System.out.println("the original list");
list.display();
System.out.println();
System.out.println("the reversed list");
list.revers();

list.display();
}


}
