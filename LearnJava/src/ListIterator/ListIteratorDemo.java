package ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List a=new ArrayList<String>();
        a.add("aa");
        a.add("bb");
        a.add("cc");

        ListIterator b=a.listIterator();
        while(b.hasNext()){
            String s=b.next().toString();
            if(s.equals("bb")) {
                b.add("jiajia");
            }
            System.out.println(s);
        }
        System.out.println(a.toString());
        System.out.println("hello".hashCode());
    }
}
