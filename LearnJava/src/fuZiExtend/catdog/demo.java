package fuZiExtend.catdog;

public class demo {
    public static void main(String[] args) {
        cat a=new cat("kiki",7);
        a.method();
        dog b=new dog();//didnt extend 有参构造函数from father.
        b.method();
        animal c=new cat();//******


    }
}
