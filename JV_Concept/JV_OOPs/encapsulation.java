import java.util.Scanner;
public class encapsulation {
    private  double bal=5000;   //encapsulation
    private  int pwd; //private instense variable

    public void deposite(double money) {
        System.out.println("enter password=");
        try (Scanner sc = new Scanner(System.in)) {
            pwd=sc.nextInt();
        }
        if(pwd == 123){
            bal=bal+money;
            System.out.println("deposited money=" + money);
            System.out.println("total Balance=" + bal);
        }

        else{
            System.out.println("invalid password...");
        }
    } 
    public void withdraw(double money) {
        System.out.println("enter password= ");
        try (Scanner s=new Scanner(System.in)) {
        pwd =s.nextInt();

        if(pwd == 123){
            bal=bal-money;
            System.out.println("withdrawed money=" + money);
            System.out.println("total Balance=" + bal);
            }
        }
    }
    public void checkBal(){
        System.out.println("total Balance=" + bal);
        try( Scanner s=new Scanner(System.in)) {
        pwd =s.nextInt();
        if(pwd == 123){
        System.out.println("Total bal.= "+ bal);
        }
    }
}
}
class customer{   //only this line is shown tro customer

    public static void main(String[] args) {
        encapsulation b=new encapsulation();
        int opt;
        System.out.println("1.Deposite: ");
        System.out.println("2.Check Balance: ");
        System.out.println("3.withdraw: ");
        System.out.print("\n Enter your choice: ");
        
        try (Scanner s2 = new Scanner(System.in)) {
            opt=s2.nextInt();
        }
        switch(opt){
            case 1: b.deposite(100);
            break;
            case 2: b.withdraw(1000);
            case 3: b.checkBal();
            break;
            default: System.out.println("invalid...");    
        }
    }

}