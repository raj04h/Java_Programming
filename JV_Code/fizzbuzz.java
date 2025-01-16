import java.util.Scanner;

public class fizzbuzz{
    public static void main(String[] args) {
        System.out.print("enter i=");
        try(Scanner scan=new Scanner(System.in)){
        int i= scan.nextInt();

        if(i%3==0)
        {
            if(i%5==0)
            {
            System.out.println("fizzbuzz");}
            else
            {
            System.out.println("fizz");}}
        if(i%5==0)
        {
            if(i%3==0)
            {
                System.out.println("fizzbuzz");}
            else{
                System.out.println("buzz");}}
        
    else if(i%4==0 && i%5==0){
        System.out.println("dent");
    }    
    else{
        System.out.println("i=" +i);}           
           
        }}}



         