import java.util.Scanner;
//main class donly linked list
public  class dobly {
    //node class for storing the data
    class node{
        int data;
        node left_link;
        node right_link;
//constructor for node class
        node(int data){
            this.data=data;
            this.left_link=null;
            this.right_link=null;
        }

    }
//initalising the frist class ass constent and null
    node frist;
//creating the list 
//or inserting at the frount 
    public void insert_frount(int data){
        node temp=new node(data);
            if(frist==null){
                frist=temp;
                return;
            }
            frist.left_link=temp;
            temp.right_link=frist;
            frist=temp;
            display();
        
        }
        //creating list and inserting at the end

        public void insert_end(int data){
            node temp=new node(data);
            node cur=frist;
            if(frist==null){
                temp=frist;
                return;
            }
            while(cur.right_link!=null){
                cur=cur.right_link;
            }
            cur.right_link=temp;
            display();
        }
//delete node at the frount 
        public void delete_frount(){
           
            if(frist==null){
                System.out.println("list is empty");
                return;
            }
            frist=frist.right_link;
            display();
        }
//delete node at end
        public void delete_end(){
node cur,prev;
if(frist==null){
    System.out.println("list is empty");
    return;
}

else if(frist.right_link==null){
    frist=null;
}

prev=frist;
cur=frist.right_link;

while(cur.right_link!=null){
prev=prev.right_link;
cur=cur.right_link;
}
prev.right_link=null;
display();
        }
//display the list
        public void display(){
            node cur=frist;
            if(frist==null){
                System.out.println("list is empty");
            }

            while(cur!=null){
                System.out.print(cur.data+"->");
                cur=cur.right_link;
            }
            System.out.println();
        }

//main class to call all the funtions

        public static void main(String args[]){
            dobly list=new dobly();
            Scanner s= new Scanner(System.in);
            int ch;
            int data;
            while(true){
            System.out.println("1.insert frount \n 2.insert end \n 3.delete frount \n4.delete end\n  enter your choice ");
    ch=s.nextInt();
    switch(ch){
        case 1: System.out.println("enter number ");
        data=s.nextInt();
        list.insert_frount(data);
        break;

        case 2:System.out.println("enter number ");
        data =s.nextInt();
        list.insert_end(data);
        break;

        case 3:list.delete_frount();
        break;
        case 4:list.delete_end();
        break;
    }
        }

    }
}


