package edu.kreyolonlineclass;

public class Exercise10_13 {
    // This program tests the result for my rectangle class
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2,2,5.5,4.9);
        System.out.println(r1.overlaps(new MyRectangle2D(1,2,2.3,3.4)));

    }
}

class MyRectangle2D {
    double x;
    double y;
    double width;
    double height;

    MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // return the value of x
    public double getX() {
        return this.x;
    }

    // update the value of x
    public void setX(double x) {
        this.x = x;
    }

    // return the value of y
    public double getY() {
        return this.y;
    }
    // update the value for y
    public void setY(double y) {
        this.y = y;
    }

    // return the width of the rectangle
    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    // return the perimeter of the rectangle
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    // check to see if the p(x, y) is inside the rectangle
    public boolean contains(double x, double y){
        return ((x> this.x-(this.width/2)) && (x< ((this.width/2)+this.x)) && (y>this.y-(this.height/2)) && (y<(height/2)+this.y));
    }
    // check to see if a rectangle is inside the other
    public boolean contains(MyRectangle2D r){
        return (((this.x-(this.width/2))< (r.x - (r.width/2))) && ((this.x+(this.width/2))> (r.x + (r.width/2))) &&
                ((this.y-(this.height/2))<(r.y -(r.width/2))) && ((this.y + (this.height/2))>(r.y+(r.height/2))));
    }

    // check to see if the rectangle overlaps
    public boolean overlaps(MyRectangle2D r){
        return !contains(r);
    }
}