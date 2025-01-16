class A
{
    int a; String name;
    A() // A is default constructor with same name as class A
        // default constructor = o,null

    // A(int a, String name) -> A is parameterised constructor
    {
        a=100; name="nude";
    }   

    {
        a=100; name="nude";
    }
    void show()
    {
        System.out.print(a+name);

    }
}
class B{
    public static void main(String[] args) {  // calling constructor A
        A rf=new A();// rf= variable  name of A constructor
                        // new keyword for memory allocation
                        // constructor is auto called 

        rf.show();   // show is another method which we created it manually so we call it 
    }   
    }