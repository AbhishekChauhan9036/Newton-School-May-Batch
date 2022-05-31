import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
       

            double a,b,c,root1,root2;
			int temp;
			Scanner inp=new Scanner(System.in);
			a=inp.nextDouble();
			b=inp.nextDouble();
			c=inp.nextDouble();
			double dt=(b*b)-(4.0*a*c);
			if(dt>0.0)
				temp=1;
			else if(dt==0.0)
				temp=0;
			else
				temp=-1;
			switch(temp)
			{
				case 1:
					root1=(-b+Math.sqrt(dt))/(2.0*a);
					root2=(-b-Math.sqrt(dt))/(2.0*a);
					System.out.format("%.2f",root1);
					System.out.format("\n%.2f",root2);
					break;
				case 0:
					root1=-b/(2.0*a);
					System.out.format("%.2f",root1);
					System.out.format("\n%.2f",root1);
					break;
				case -1:
					root1=-b/(2.0*a);
					root2=Math.sqrt(-dt)/(2.0*a);
					System.out.format("%.2f+",root1);
					System.out.format("i%.2f",root2);
					System.out.format("\n%.2f-",root1);
					System.out.format("i%.2f",root2);
					
					break;
			}
	}
}