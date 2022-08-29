import java.util.*;

// Do not edit the Quadrilateral class
abstract class Quadrilateral {
   double side1;
   double side2;
   double side3;
   double side4;

   public Quadrilateral(double side1, double side2, double side3, double side4) {
       this.side1 = side1;
       this.side2 = side2;
       this.side3 = side3;
       this.side4 = side4;
   }

   protected abstract double getArea();

   protected double getPerimeter() {
       return (side1+side2+side3+side4);
   }
}

// Implement class Parallelogram and methods getArea() and getPerimeter()
class Parallelogram extends Quadrilateral {
    //Write your code here
    double height;
    Parallelogram(double s1, double s2, double h){
        super(s1,s2,s1,s2);
        this.height=h;
    }

    public double getArea(){
        return side1*height;
    }
   
}

// Implement class Rhombus and methods getArea() and getPerimeter()
class Rhombus extends Parallelogram {
    //Write your code here
    double height;
    Rhombus(double s1, double h){
        super(s1,s1,h);
        this.height=h;
    }
   
}

//Implement class Rectangle and methods getArea() and getPerimeter()
class Rectangle extends Parallelogram {
    //Write your code here
    Rectangle(double s1, double s2){
        super(s1,s2,s2);
    }
  
}
//Implement class Square and methods getArea() and getPerimeter()
class Square extends Rhombus {
    //Write your code here
    Square(double s1){
        super(s1,s1);
    }
   
}



// Do not edit the Main class
class Main {
   public static void main(String[] args) {
       //Write your code here
        Scanner sc=new Scanner(System.in);
        double s1,s2,h;
        s1=sc.nextDouble();
        s2=sc.nextDouble();
        h=sc.nextDouble();

        double ss1,hs,rs1,rs2,sq1;
        ss1=sc.nextDouble();
        hs=sc.nextDouble();

        rs1=sc.nextDouble();
        rs2=sc.nextDouble();

        sq1=sc.nextDouble();
        if(s1<0 || s2<0 || h<0 || ss1<0 || hs<0 || rs1<0 || rs2<0 || sq1<0){
            System.out.println("Length of a side cannot be negative. Please Enter a positive integer");
        }
        else{
        Parallelogram parallelogram=new Parallelogram(s1,s2,h);
        Rhombus rhombus=new Rhombus(ss1,hs);
        Rectangle rectangle=new Rectangle(rs1,rs2);
        Square square=new Square(sq1);
        System.out.println("Perimeter of Parallelogram is " + parallelogram.getPerimeter() +" and Area of Parallelogram is " + parallelogram.getArea());
        System.out.println("Perimeter of Rhombus is " + rhombus.getPerimeter() +" and Area of Rhombus is " + rhombus.getArea());
        System.out.println("Perimeter of Rectangle is " + rectangle.getPerimeter() +" and Area of Rectangle is " + rectangle.getArea());
        System.out.println("Perimeter of Square is " + square.getPerimeter()+ " and Area of Square is " + square.getArea());
        }
        sc.close();
   }
}