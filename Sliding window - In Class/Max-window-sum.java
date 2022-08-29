import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k= sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        long sum = 0;
        int max = 0;
        for(int i = 0; i <= n-k ; i++){
            max = 0;
            for(int j = 0; j<k; j++){
                if(max < arr[i+j]){
                    max = arr[i+j];
                }
            }
            sum = sum + max;
        }
        System.out.println(sum);
    }
}