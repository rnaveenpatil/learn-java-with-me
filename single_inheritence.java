class Animal{
public  void nameAnimal(String name){
System.out.println("the name of animal is="+name);
}
}
class owner extends Animal{
public void owner_of(String owns){
System.out.println("the owner of animal is "+owns);

}}

public class single_inheritence{
public static void main(String args[]){
owner o1=new owner();
o1.nameAnimal("dog");
o1.owner_of("rahul braaaa");
}}
