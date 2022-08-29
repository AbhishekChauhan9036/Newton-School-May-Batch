
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int start = -1;
        for(int i = 0; i<k; i++){
            sum = sum + arr[i];
        }
        if(sum == 0){
            System.out.println("1");
        }
        else{
            for(int i = k; i<n; i++){
                sum = sum + arr[i] - arr[i-k];
                if(sum ==0){
                    start = i - k + 2;
                    break;
                }
            }
            System.out.println(start);
        }

         
    }
}