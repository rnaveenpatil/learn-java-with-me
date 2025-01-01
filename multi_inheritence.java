import java.util.*;

class student_name{

public void name_student(String name){
System.out.println ("name is "+name);
}
}
class student_age extends student_name{

public void ages(int age){
System.out.println("I am "+age+"old");
}
}

class student_USN extends student_age{

public void USN(String usn){
System.out.println("usn is:"+usn);
}
}

public class multi_inheritence{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
student_USN s1=new student_USN();
System.out.println("enter name");
String name=s.nextLine();
System.out.println("enter age");
int age=s.nextInt();
System.out.println("usn is");
String usn=s.nextLine();
s1.name_student(name);
s1.ages(age);
s1.USN(usn);
}
}
