package Calender;

import java.util.Calendar;
import java.util.Scanner;

public class FebDays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您要查询的年份：");
        int year= sc.nextInt();
        Calendar a=Calendar.getInstance();
        a.set(year,2,1);
        a.add(5,-1);//field可以写成Calender.Date.
        int b=a.get(Calendar.DATE);
        System.out.println(b);
        int[] e={1,2,3};
        System.out.println(e[3]);
        /*
  2 exceptions
java.lang.Object
java.lang.Throwable
java.lang.Exception
java.lang.RuntimeException
java.lang.IndexOutOfBoundsException

java.lang.Object
java.lang.Throwable
java.lang.Exception
java.text.ParseException


         */


    }
}
