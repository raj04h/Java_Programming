public class exception {
    public static void main(String[] args) {
        System.out.println("main method called");
        int a=4, b=0, c;
        try {  // if not use try catch statement, otherwise provide a error message
            c=a/b;  //exception case
            System.out.println(c); // never a num is divided by zero
        }
        catch(Exception e){   // exception handeled by catch statement
            System.out.println("can't divided by zero"); // execute
        }
        System.out.println("main method ended");
}
}
