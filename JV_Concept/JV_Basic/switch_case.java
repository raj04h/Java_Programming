import java.util.Scanner;

public class switch_case {
    public static void main(String[] args)
    {
        try (Scanner scan = new Scanner(System.in)) 
        {
            System.out.print("enter day-");
            String day= scan.nextLine();

            switch (day) {
                case "sunday":
                  System.out.println("Today is Sunday");
                  break;
                case "monday":
                  System.out.println("Today is Monday");
                  break;
                case "tuesday":
                  System.out.println("Today is Tuesday");
                  break;
                case "wednesday":
                  System.out.println("Today is Wednesday");
                  break;
                case "thursday":
                  System.out.println("Today is Thursday");
                  break;
                case "friday":
                  System.out.println("Today is Friday");
                  break;
                case "saturday":
                  System.out.println("Today is Saturday");
                  break;
            }
        } 

    }
    
}
