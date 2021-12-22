package Currentmills;

public class CurrentMills {
    public static void main(String[] args) {
        long mills =System.currentTimeMillis();
        long start=System.currentTimeMillis();
        for(int i =0;i<=10000;i++){
            System.out.println(i);
        }
        long end=System.currentTimeMillis();
        long time=end-start;
        System.out.println("time:"+time);
        Integer a= 100;
        String b=String.valueOf(a);
        System.out.println(a+22);
        String c=a.toString();
        System.out.println(c+22);
        System.out.println(a+22);
        String d="777";
        int e=a.valueOf(d);
        System.out.println(e+1);
        String f="666";
        int g=Integer.parseInt(f);
        System.out.println("g");
        System.out.println(g);

    }
}
