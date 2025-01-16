import java.util.Scanner;


public class operator
{
    public static void main(String[] args)
    {
// Unary operator
        int x = 10;
        System.out.println(x++); // 10 -> 11 it shows old value but increased
        System.out.println(x);

        System.out.println(++x); // 12  it shows new increased value

        System.out.println(x--); // 12 -> 11 it shows old value but decreased
        System.out.println(x);

        System.out.println(--x); // 10
        System.out.println(--x);


// left & right shift operator
        System.out.println(10<<2);//10*2^2=10*4=40
        System.out.println(10>>2);   //10/2^2=10/4=2

        int u=2;
        int v=4;

        System.out.println(u+=v); // a=4+2=6
        System.out.println(u=u+v);  //a=6+4


try (// Algebric operators
        Scanner input = new Scanner(System.in)) {
            System.out.print("a= ");
            int a= input.nextInt();

            System.out.print("b= ");
            int b= input.nextInt();

            System.out.print("addition= ");
            System.out.println(a+b);
            System.out.print("substraction= ");
            System.out.println(a-b);
            System.out.print("multiplication= ");
            System.out.println(a*b);
            System.out.print("division= ");
            System.out.println(a/b);
            System.out.print("remainder= ");
            System.out.println(a%b);
        }
        
 // terniory operator
 
 int a=10,b=50,c=30;
 int r=(a>b)?(a>c?a:c):(b>c?b:c);
 System.out.println(r+"ternery ");

    }
}
