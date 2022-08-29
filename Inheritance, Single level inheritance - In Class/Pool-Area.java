// you two classes goes here
/*
example:
class Cube{

}
*/
class Rectangle {
    double width = 0;
    double length = 0;

    Rectangle(double w, double l){
        if(w>0)
        this.width = w;
        if(l>0)
        this.length = l;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getArea() {
        return this.length * this.width;
    }
}

class Cuboid extends Rectangle {
    double height;

    Cuboid(double w, double l, double h) {
        super(w,l);
        this.height = h > 0 ? h : 0;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }
}