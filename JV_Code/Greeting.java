import java.util.Scanner;


public class Greeting
 {
    public static void main (String[] args)
    {
        try(Scanner scan= new Scanner(System.in))
        {
            System.out.print("name-");
            String name= scan.nextLine();
            System.out.print("roll-");
            int roll= scan.nextInt();

            System.out.println(name);
            System.out.println(name.length());
            System.out.println(name.toLowerCase());
            System.out.println(name.trim());
            System.out.println(name.replace('r','p'));
            System.out.println(name.startsWith("ho"));
            System.out.println(name.endsWith("po"));
            System.out.println(name.charAt(2));
            System.out.println(name.indexOf(2));
            System.out.println(name.indexOf("s",2));
            System.out.println(name.equals("harry"));

            /*\n-newline
             \\- backslash
             */


            



            if(name=="mohan" || roll==23)
            {
                System.out.println("welcome ");
            }
            else if(name=="sohan"|| roll==34)
            {
                System.out.println("weldone");
            }
            else if(name=="rohan" || roll==35)
            {
                System.out.println("wele");
            }
            else{
                System.out.println("invalid person");
            }

    }    
    }
}