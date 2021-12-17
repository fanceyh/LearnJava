package learn2112;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        int [] score = new int [6];
        Scanner sc= new Scanner(System.in);

        int i=0;
        while(i<6){
            score[i]= sc.nextInt();
            i++;
        }
        int a=max(score);
        System.out.println(a);

    }
    public static int max (int[]arr){
        int i=1;
        int max= arr[0];
        while (i<6) {

            if(max<arr[i])
                max=arr[i];
            i++;

        }
        return max;
    }

}

