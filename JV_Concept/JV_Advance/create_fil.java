import java.io.*;

public class create_fil {  // throws exception is same as try catch method
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\himan\\Desktop\\lc.txt");
        if (f.createNewFile()) {
            System.out.println("created");
           }
        
        
        else if (f.exists()) {
        System.out.println("file existed");
        }

        else {
            System.out.println("error");
    
}
FileWriter d=new FileWriter("C:\\Users\\himan\\Desktop\\lc.txt");
d.write("java is good but lengthy");
d.close();  
FileReader e=new FileReader("C:\\Users\\himan\\Desktop\\lc.txt");
e.read();
e.close();

}
}