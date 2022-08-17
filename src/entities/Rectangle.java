package entities;

import services.Shape;

public class Rectangle implements Shape {
    private Double width;
    private Double height;

    public Rectangle(){
    }

    public Rectangle (double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return width * height;
    }

}
