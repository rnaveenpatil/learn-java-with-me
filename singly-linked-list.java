
//code for SINGLY LINKED LIST IN JAVA


import java.util.*;

class ll{

//creating a class node for the creation of linked list
    class node{
        int data;
        node link;
        node(int data){
            this.data=data;
            this.link=null;
        }
    }
//taking frist node as constant 
//and initialise frist as null
    node frist;


//inserting node at the frount of the linked list

        public void insertfrount(int data){
            node temp=new node(data);
            if(frist==null){
                frist=temp;
                return;
            }

            temp.link=frist;
            frist=temp;
        
    }

//inserting the node at the end of the linked list
   public void insertend(int data){
        node temp=new node(data);
        node cur;
        cur=frist;
        while(cur.link!=null){
            cur=cur.link;

        }
        cur.link=temp;
    }

    //function for display a linked list 
    public void display(){
     node cur ;
        cur = frist;
        if(frist==null){
            System.out.println("list is empty");
        }
while(cur!=null){
    System.out.print(cur.data+"->");
    cur=cur.link;
}
System.out.println();
    }

//delete the node at the end of the linked list
public void deleteend(){
    node cur,prev;
    prev=frist;
    cur=frist.link;
    if(frist==null){
        System.out.println("the list is empty ");
return;
    }

    else if(frist.link==null){
        frist=null;
    }
    while(cur.link!=null){
        cur=cur.link;
        prev=prev.link;
        
    }
    prev.link=null;

}


//delete the node at the frount of the linked list
public void deletefrount(){
    
if(frist==null){
    System.out.println("list is empty s");
return;
}
    frist=frist.link;

}


//take input and call the funtions using switch statement
    public static void main(String args[]){
        ll list = new ll();
Scanner s=new Scanner(System.in);
      int ch;
      int data;
      while(true){
      System.out.println("1.insert frount \n 2 insert end \n 3 delet frount 4.delete end \n 5.dislay\n enter your chioce");
      ch=s.nextInt();

      switch(ch){
        case 1: System.out.println("enter data");
        data=s.nextInt();
        list.insertfrount(data);
        break;
        case 2: System.out.println("enter data ");
        data=s.nextInt();
        list.insertend(data);
        break;
        case 3: list.deletefrount();
        break;
        case 4:list.deleteend();
        break;
      case 5:list.display();
      break;
        }
        }
      }
    
}
