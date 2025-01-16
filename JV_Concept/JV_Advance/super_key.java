
class Bicycle{
    String define(){
        return  "a vehicle with padals.";
    } 
}
class MotorCycle extends Bicycle{ //Inherit Bicycle class in Motorcycle
    String define(){
        return  " a cycle with engine.";
    }
    MotorCycle(){

        String motortemp=define(); // MotorCycle define fun
        System.out.println("Hey, "+ motortemp);
        String temp=super.define();  //super.define() call accesses the define()
        System.out.print("My ancedtor "+ temp);
    }
}
public class  super_key{
    public static void main(String[] args) {
        MotorCycle bike=new MotorCycle();
    }
}
