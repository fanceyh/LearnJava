package com.student.manage;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        System.out.println("---------欢迎来到学生管理系统-----------");
        System.out.println("请选择您要使用的功能");
        System.out.println("1.查看学生。");
        System.out.println("2.新增学生。");
        System.out.println("3.修改学生。");
        System.out.println("4.删除学生。");
        System.out.println("5.退出系统。");
        System.out.println("-------------------------------------");
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> List=new ArrayList<>();
        int input=sc.nextInt();
        sc.nextLine();
        while(true) {
            if(input==5){
                System.out.println("5.退出系统.byebye~");
                break;
            }
            switch (input) {
                case 1:
                    System.out.println(List);//输出对象地址
                    for(int i=0;i<List.size();i++) {
                        System.out.print(List.get(i).getId()+",");
                        System.out.print(List.get(i).getName()+",");
                        System.out.print(List.get(i).getAge());
                        System.out.println();
                    }
                    System.out.println("1.查看学生cg。");
                    break;
                case 2:
                   /*
                   StringBuilder a=new StringBuilder();
                    System.out.println("请输入id:");
                    a.append(sc.nextLine());//??????为什么非要两个nextLine（）才能输入？？？？
                    //Scanner作为一个扫描器，它扫描数据都是去内存中一块缓冲区中进行扫描并读入数据的，而我们在控制台中输入的数据也都是被先存入缓冲区中等待扫描器的扫描读取。这个扫描器在扫描过程中判断停止的依据就是“空白符”，空格啊，回车啊什么的都算做是空白符。
                    //
                    //其次，nextInt()方法在扫描到空白符的时候会将前面的数据读取走，但会丢下空白符“\r”在缓冲区中，而接下来，nextLine()方法自动读取了被nextInt()丢下来的”\r”作为他的结束符，
                    //————————————————
                    //版权声明：本文为CSDN博主「蓝魔之泪LRD」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
                    //原文链接：https://blog.csdn.net/w252064/article/details/78471267
                    a.append(sc.nextLine());
                    System.out.println("请输入姓名：");
                    a.append(sc.nextLine());
                    System.out.println("请输入年龄：");
                    a.append(sc.nextLine());
                    //String b=a.toString();
                    //List.add(b);
                    System.out.println("2.新增学生cg。"+a);
                    break;
                    */
                    System.out.println("请输入id：");
                    String a=sc.nextLine();
                    System.out.println("请输入姓名：");
                    String b=sc.nextLine();
                    System.out.println("请输入年龄：");
                    String c=sc.nextLine();
                    Student d=new Student(a,b,c);
                    List.add(d);
                case 3:
                    System.out.println("3.修改学生cg。");
                    break;
                case 4:
                    System.out.println("4.删除学生cg。");
                    break;
                default:
                    System.out.println("未知选择！");
            }
            System.out.println("---------欢迎来到学生管理系统-----------");
            System.out.println("请选择您要使用的功能");
            System.out.println("1.查看学生。");
            System.out.println("2.新增学生。");
            System.out.println("3.修改学生。");
            System.out.println("4.删除学生。");
            System.out.println("5.退出系统。");
            System.out.println("-------------------------------------");
            input=sc.nextInt();
            sc.nextLine();
        }

    }
}
