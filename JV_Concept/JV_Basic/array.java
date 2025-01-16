import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int a[]= {10,20,440,45,67};

        for(int b:a)  // b= index of each element of array
    {
        System.out.println(b+ " ");
    }

    int twod[][]=new int [2][2];
    System.out.println("enter array element= ");
    try (Scanner s = new Scanner(System.in)) {
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            
            {
                twod[i][j]=s.nextInt();
               System.out.println(twod[i][j]+" ");
            }
        }
    }  
    }
    
}
