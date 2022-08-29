class Circle {
     double radius;
      
      Circle(double radius){
           if(radius < 0)
           this.radius = 0;
           else
           this.radius = radius;
     }

     double getRadius() {
           return radius;
     }

     double getArea (){
           return (Math.PI*radius*radius);
     }
}
class Cylinder extends Circle {
      
      double height;
      Cylinder (double radius, double height){
           
            super(radius);
            if(height < 0)
           this.height = 0;
           else
           this.height = height;
      }

      double getHeight() {
            return height;
      }

      double getVolume(){
            return getArea()*height;
      }
}