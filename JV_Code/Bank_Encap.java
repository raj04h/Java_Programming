// Encapulation is act like a backend, which hide function from user, it contains instense of private class

class Encap_method {
    private String account;
    private double balance;

    public Encap_method(String acc, double bal){
        this.account=acc;
        this.balance=bal;
    }
    public String getacc(){
        return account;
    }
    public double getbal(){
        return  balance;
    }

    public void deposit(double money){
        if(money>0){
            balance+=money;
            System.out.println("Deposited: " + money);
        }
        else{
            System.out.println("No money available yet");
        }
    }
    public void withdraw(double  money){
        if(money>0 && money<=balance){
            balance-=money;
            System.out.println("Withdrawn: " + money);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    
}

public class Bank_Encap{
    public static void main(String[] args) {
        Encap_method Myacc = new Encap_method("Xyz123", 500.00);  // It act as frontend to take methods from backend
        System.out.println("Account: "+ Myacc.getacc());
        System.out.println("Balance: "+ Myacc.getbal());

        Myacc.deposit(2000.00);
        System.out.println("Balance after deposit: " + Myacc.getbal());

        Myacc.withdraw(200.00);
        System.out.println("Balance after withdraw: " + Myacc.getbal());

    }

}
