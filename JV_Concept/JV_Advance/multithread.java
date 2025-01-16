public class multithread extends Thread {
    @Override
    public void run(){
        try{
        for(int i=1;i<=5;i++){
            System.out.println("hraj");  // sleep is thread property
            Thread.sleep(1000); //delay for 1000 msec
        }
    }
    catch(InterruptedException i){}
}}
class multi{
    public static void main(String[] args) throws Exception {
        multithread m= new multithread();
        m.run(); // 1st start  multithread class then multi
        m.start(); //  1st starts multi class then multithread class
        for(int i=1;i<=5;i++){
            System.out.println("hhh");
            Thread.sleep(1000);
    }
}}
