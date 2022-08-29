import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i< n; i++){
            sum = sum+arr[i];
            if(i +1 <= w){
                System.out.print(sum/(i+1) + " ");
            }
            else{
                sum = sum - arr[i-w];
                System.out.print(sum/w + " ");
            }

        }
             
    }
}