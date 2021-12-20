package learn2112;
//评委打分
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
        System.out.println("length"+score.length);
        System.out.println("avg is:"+avg(score)+'.');

    }
    //-----------------
    public static int sum(int[]arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    //-----------------
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
    //-----------------
    public static int min(int[]arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    //-----------------
    public static int avg(int[]arr){
        return (sum(arr)-max(arr)-min(arr))/(arr.length-2);
    }

}

