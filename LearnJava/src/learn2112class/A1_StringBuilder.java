package learn2112class;

public class A1_StringBuilder {
    public static void main(String[] args) {
        int[] a={1,2,3};
        StringBuilder s=new StringBuilder();
        s.append('[');
        for(int i=0;i<3;i++) {
            if(i==2)
                s.append(a[i]);
            else
                s.append(a[i]+",");
        }
        s.append(']');
        System.out.println(s);
    }
}
