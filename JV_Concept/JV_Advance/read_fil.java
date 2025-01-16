import java.io.*;
public class read_fil {
    public static void main(String[] args)  throws IOException {
    try (FileReader e = new FileReader("C:\\Users\\himan\\Desktop\\Ic.txt")) {
        int i;
        while((i=e.read()) != -1){
            System.out.println((char)i);
        }
    }
    }
}
