import java.util.*;
public class linked_list {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("ankit");
        list.add("amit");
        list.add("altaf");
        list.add("hraj");
        
        System.out.println(list);
        System.out.println(list.size());

/*
        list.remove();  // default remove 0th element
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
*/

        for(String s : list){
            System.out.println(s);
        }

    }

    
}
