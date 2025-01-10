

 abstract class frinds{
    frinds(){
        System.out.println("our frinds");
     }
    abstract void name(String naam);
    public void age(int years){
        System.out.println(years+"  old");
          
   
    }
}

class frind1 extends frinds{
    frind1(){
        System.out.println("frist frind");
    }
    public void name(String naam){

        System.out.println(naam);
    }
}

class frind2 extends frinds{
    public void name(String naam){
        System.out.println(naam);
    }
}

class frind3 extends frinds{
    public void name(String naam){
        System.out.println(naam);
    }

}

public class abstraction{
    public static void main(String[] args) {
        
        frind1 f1=new frind1();
        f1.name("rahul braaaaa");
        f1.age(69);
frind2 f2=new frind2();
f2.name("pruthvi braaaaaaaa");
f2.age(96);
frind3 f3=new frind3();
f3.name("shashaank  braaaaaaaa");
f3.age(608);




    }
}