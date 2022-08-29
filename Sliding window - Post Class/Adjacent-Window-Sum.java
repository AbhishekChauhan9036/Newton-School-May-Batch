import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void checkTheSum(int arr[], int n, int k, int s){
        int sum = 0;
        int count = 0;
        boolean flag = false;

        HashSet<Integer> hs = new HashSet<>(); 

        for(int i=0; i<n; i++){
            sum += arr[i];
            count++;

            if(count > k){
                sum -= arr[i-k];
                count--;
            }

            if(count == k){
                int check = s - sum;
                if(hs.contains(check)){
                    System.out.println("YES");
                    flag = true;
                    break;
                }
                hs.add(sum);
            }
        }
        if(!flag){
            System.out.println("NO");
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        checkTheSum(arr, n, k, s);
    }
}