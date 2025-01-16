
public class inhari {    // super class 
    int a,b,c;          // class inhari has only 2 works
    void add()
    {
        a=10;
        b=20;
        c=a+b;
        System.out.println("sum="+ c);
    
    }
    void sub(){
        a=200;
        b=100;
        c=a-b;
        System.out.println("sub="+ c);
    }
}
class B extends inhari  //1st sub class
{                        // class B has only 4 works 2 its own + 2 worlk of inhari
    void mul(){
    a=10;
    b=20;
    c=a*b;
    System.out.println("multi="+ c);
}
    void div(){
        a=200;
        b=100;
        c=a/b;
        System.out.println("div="+ c);
    }
}
class C extends B //2nd sub class
{                  // class c has total 6 work 2+2+2 from previous
    void rem(){
        a=200;
        b=100;
        c=a%b;
        System.out.println("rem="+ c);
    }
}
 class Test{
    public static void main(String args[]){
        C r=new C();
        r.add();
        r.sub();
        r.div();
        r.mul();
        r.rem();
    }
 }