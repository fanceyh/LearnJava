package learn2112;

public class arrayFilterSum {
    public static void main(String[] args) {
        int[] arr={68,27,95,88,171,996,51,210};
        int i=0;
        int sum=0;
        while(i<8){
            if(arr[i]%10!=7&&arr[i]/10%10!=7&&arr[i]%2==0){
                sum=sum+arr[i];
            }
            i++;
        }
        System.out.println(sum);
    }
}
