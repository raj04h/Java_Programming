import java.util.Scanner;

 class Mark_cal{
    public static void main(String[] args) 
{
    try (Scanner scan = new Scanner(System.in))
    {
        System.out.print("total marks=");
        int total= scan.nextInt();
        System.out.print("enter 1st=");
        float first =scan.nextFloat();
        System.out.print("enter 2nd=");
        float second=scan.nextFloat();
        System.out.print("enter 3rd=");
        float third=scan.nextFloat();
    
    float sum= first+second+third;
    System.out.println("sum= "+ sum);
    double percentage= ((sum/total)*100);
    System.out.println("presentage= "+percentage+"%");
    }
}

}

