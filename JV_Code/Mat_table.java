import java.util.Scanner;

public class Mat_table{
    public static void main(String[] args) {
        try (Scanner scan= new Scanner(System.in))
        {
            System.out.print("enter num= ");
            int num=scan.nextInt();
            for(int i=1;i<=10;i++)
            {
                System.out.println(num+"*"+i+"="+num*i);

            }
        }
    }
    
}
