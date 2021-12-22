package fuZiExtend.catdog;

public class cat extends animal {
    public cat(){

    }
    public cat(String n,int a){
        super(n,a);
    }
    public void method(){
        super.method();
        System.out.println("cat play");
    }
}
