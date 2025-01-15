import java.util.Scanner;

public class cercular_queue {
static int frant=0;
static int rear=-1;


    public static void insert(int[] q,int ele,int size){
       
rear=(rear+1)%size;

q[rear]=ele;
display(q,size);
    }

    public static int delete(int[] q,int size){
        if(frant==0 && rear==-1){
            System.out.println("queue is empty ");
        }
        frant=(frant+1)%size;
        display(q,size);
        return q[frant];
    }

    public static void display(int[] q,int size){
        int i=frant;
        for(i=frant; i!=(rear+1)%size; i++){
            System.out.print(q[i]+",");
        }
        System.out.println(q[i]);
    }

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter size of queue");
      int size=s.nextInt();
      int[] q;
      q=new int[size];
    int ch,ele;
    while(true){
    System.out.println("1.insert \n 2.delete\n enter your choice ");
ch=s.nextInt();
switch(ch){
    case 1:System.out.println("enter element ");
    ele=s.nextInt();
    insert(q,ele,size);
    break;

    case 2:delete(q,size);
    break;
}

    }

    }
    
}
