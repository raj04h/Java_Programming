import java.util.*;
public class array_list {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("hraj");
        list.add("VIT");
        list.add("Praj");
        System.out.println(list);
        list.add("anm");
        System.out.println(list);
        list.add(1,"draa");
        System.out.println(list);
        list.add(0,"errr");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
        list.set(1,"altaf");
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }

    
}
