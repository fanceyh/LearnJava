package learn2112;

public class ArrMax {
    public static void main(String[] args) {
        int[] arr = {1,9,51,202,7};
        arrMax(arr);
        System.out.println(arrMax(arr)+"aaa");
    }
    public static int arrMax(int[] arr) {
        int max= arr[0];
        for(int x=1;x<arr.length;x++) {
            if (max < arr[x])
            max= arr[x];

        }
        return max;
    }
}
