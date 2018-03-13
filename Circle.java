/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapedemo;

/**
 *
 * @author amipatel
 */
public class Circle extends Shape {
    
    protected double radius;
    
    public Circle(){
        
    }
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(double radius,String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    @Override
    public String toString(){
        return "***Circle Class***\n"+
                "Radius: "+radius;
          
    }
}
