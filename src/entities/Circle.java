package entities;

import services.Shape;

public class Circle implements Shape{
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return Math.PI * Math.pow(radius, 2);
    }

    
}
