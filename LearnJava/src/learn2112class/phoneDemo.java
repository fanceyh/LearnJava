package learn2112class;
//

public class phoneDemo {
    public static void main(String[] args) {
        phone a=new phone();
        a.show();
        a.setBrand("Xiaomi");
        a.setSize(5);
        a.show();
        phone b=new phone("huawei",7);
        b.show();

    }
}
