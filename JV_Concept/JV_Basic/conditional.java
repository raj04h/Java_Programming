import java.util.Scanner;

public class conditional
{
    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("a= ");
            int a= input.nextInt();

            System.out.print("b= ");
            int b= input.nextInt();


            if(a<b){
                System.out.println("a is less then b");
            }
            else if (a>=100) {
                System.out.println("your number is of three digit");
            } else if (b<=10) {
                System.out.println("a+b= ");
                System.out.print(a+b);

            }
            else
                System.out.println("number is very large");
        }
    }
}
