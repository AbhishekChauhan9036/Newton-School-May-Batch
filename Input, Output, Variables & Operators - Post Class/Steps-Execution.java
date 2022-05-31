import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        System.out.print((((((a)+8)/3)%5)*5));              
	}
}