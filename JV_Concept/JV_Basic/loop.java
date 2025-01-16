public class loop {
    public static void main(String[] args)
    {
// for loop uses when the number of iteration is fixed

        System.out.println("for");
        for(int i=0; i<10;i++)
        {
            for(int j=0;j<10;j++){
                System.out.println(i+""+j);
            }
        }
// Array loop
        int []arr ={1,22,34,4,6,34,455};
        for (int k: arr)
        {
            System.out.print("array=");
            System.out.println(k);
        

// while loop uses when number of iteration is not fixed,
        System.out.println("while");
        int u=1;
        while (u<=10)
        {
            System.out.println(u);
            u++;

// do while -> first, do any work then while loop starts
            System.out.println("do while");
            int v=1;
            do
            {
                System.out.println(v+=2);
                v++;
            }
            while(v<=10);
        }
    }

    for(int i=2;i<=10;i++)
    {
        if (i==3)
        continue; // skip 3
        // break; // to stop less then 3
        System.out.println(i+" ");
    
    
    }

    }
}
