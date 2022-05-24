/**
 *    author:  Abhishek Chauhan
 *    created:  Tue May 24 10:16:10 IST 2022
**/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static double Solve(int arr[],int n){
		int s=0;double m=0;double r=0;

		for(int i=0;i<n;i++){
			s+=Math.pow(arr[i],2);
		}

		m=(s/(double)(n));
		r=(double)Math.sqrt(m);

		return r;
	}
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int arr[]=new int[n];

		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		double ans=(Solve(arr,n));
		System.out.printf("%.6f",ans);
	}
}