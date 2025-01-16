interface Ar{
     void show(); //interface= public+ abstract
}
interface Br{
     void Disp();
}

class interfac implements Ar,Br {  //interface implementation in class multiinterfac
    public void show() {
        System.out.println("interface A");
    }
    public void Disp() {
        System.out.println("interface B");
    }
    public static void main(String[] args) {
        interfac m=new interfac();
        m.show();
        m.Disp();   
    }
}
