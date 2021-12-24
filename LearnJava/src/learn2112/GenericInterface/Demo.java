package learn2112.GenericInterface;

public class Demo {
    public static void main(String[] args) {
        Generic<String> a=new GenericImpl<String>();
        a.show("ddd");
        Generic<Integer> b=new GenericImpl<>();
        b.show(222777);

    }
}
