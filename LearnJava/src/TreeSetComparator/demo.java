package TreeSetComparator;

import java.util.Comparator;
import java.util.TreeSet;

public class demo {
    public static void main(String[] args) {
        student a=new student("lili",77);
        student b=new student("kiki",27);
        student c=new student("didi",27);
        student d=new student("xixi",27);
        TreeSet<student> ts=new TreeSet(new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                int num=o1.s-o2.s;
               int num2=o1.s-o2.s==0?o1.n.compareTo(o2.n):num;
               return  num2;
            }
        });
        ts.add(a);
        ts.add(b);
        ts.add(c);
        ts.add(d);
        for(student s:ts){
            System.out.println(s.n+" "+s.s);
        }
    }
}
