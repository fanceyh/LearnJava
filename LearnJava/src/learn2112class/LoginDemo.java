package learn2112class;

import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        String username="fancey";
        String pwd="abc1";
        System.out.println("请输入用户名：");
        Scanner in= new Scanner(System.in);
        String a = in.nextLine();
        System.out.println("请输入密码：");
        String b=in.nextLine();
        if(username.equals(a)&&pwd.equals(b))
            System.out.println("登陆成功！");

    }

}
