import java.util.Scanner;

abstract class abstra {
    public String Name= "SBI Bank";
    public String IFSC="SBIN0012";
    
    public  void bank(){
        System.out.println("Bank Name= "+Name+" "+ "IFSC="+IFSC);

    }      
    }
class bank extends abstra {
    private double bal=5000;
    private int pwd;
    public double money;


    public  void deposite(){
        System.out.println("enter password=");
        try (Scanner s = new Scanner(System.in)) {
            pwd=s.nextInt();

            if (pwd==123){
                System.out.println("Enter password=");
                money=s.nextDouble();
                bal=bal+money;
            System.out.println("Deposeted money= " + money);
            System.out.println("net amount"+ bal);
            }
            else{System.out.println(" invalid pwd...");}
        }
    }}


