//inharitence 
public class student { //super class
    // if this class and its method is protected then we access it with subclass
    int roll,marks;
    String name;
    void inp(){ //if this method is private then it can not be asess by subclass methods
        System.out.println("Enter roll: ");
    }
} 
class himanshu extends student {   // subclasses extends super classes
    void dis(){   
        roll=1;
        name="hraj";
        marks=90;
        System.out.println(roll+" "+name+" "+marks);

    }
    public static void main(String[] args) {
        himanshu h=new himanshu();
        h.inp();
        h.dis();


    }
}
