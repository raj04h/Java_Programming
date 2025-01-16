class Abc{
        int a; String b; 
        Abc()
        {
            a = 10;
            b = "hello";
            System.out.println(a+ " "+b);
        }
        Abc(Abc ref)  // constructor A has class A with variable ref that copying the constructor A
        // to make private constructor  only put private at first of A
        // that constructor access only in asame class 
        {
            a = ref.a;
            b = ref.b;
            System.out.println(a+ " "+b);
        }

    }
class copy_const{
        public static void main(String[] args) {
         Abc r=new Abc();  // copying the contructor A value in r
         Abc r2= new Abc(r); // copying the r variable  value in r2
            System.out.println(r2);
     }
}

