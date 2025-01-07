//LinkedList using inbuild funtion 


//importing the java LinkedList file to main class
import java.util.LinkedList;
// main class Linkdlist
class Linkedlist{
    public static void main(String[] args) {
        //constructor for the class LinkedList with the veriable Integer Type
        
        //LinkedList<data Type> object = new LinkedList<data Type>();
        LinkedList<Integer> list=new LinkedList<Integer>();


        //to add the node at the frount we use
        //object.addFirst(data type);
        System.out.println("adding at frount ");
        list.addFirst(23);
list.addFirst(45);
list.addFirst(64);
System.out.println(list+"->");


//to add node at the end 
//object.addLast(data Type);
System.out.println("adding at end ");
list.addLast(89);
list.addLast(66);
list.addLast(56);
System.out.println(list+"->");

//to get the size
//object.addLast();
int size=list.size();
System.out.println("size of linkedlist"+size);

//to remove at the frount()
//object.removeFrist();
System.out.println("remove first");
list.removeFirst();
System.out.println(list+"->");


//to remove at the last
//object.removeLast();
System.out.println("remove last");
list.removeLast();
System.out.println(list+"->");


//to remove at the specific index
//object.remove(index);
System.out.println("to remove at index 2");
list.remove(2);
System.out.println(list+"->");

//to get the element at the spesific index
//object.get(index);
System.out.println("to get at index  1");

System.out.println(list.get(1));
    }
}