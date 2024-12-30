class student{
public void student_info(){
System.out.println("sudent information");
}
public void student_info(String name){
System.out.println("name of student is ="+name);
}
public void student_info(int age){
System.out.println("the age of student id =" +age);
}

public void student_info(char section){
System.out.println("section ="+section);
}
}

public class polymerphism{
public static void main(String args[]){
student s1=new student();
s1.student_info();
s1.student_info("rahul braaaaa");
s1.student_info(19);
s1.student_info('d');
}
}
