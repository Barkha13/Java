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
public class Rectangle extends Shape {
    
    protected double width;
    protected double length;
    
    public Rectangle(){
        
    }
    
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public Rectangle(double length, double width,String color,boolean filled){
        this.length = length;
        this.width = width;
        this.color = color;
        this.filled = filled;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getLength(){
        return length;
    }
    
    public void setLength(double length){
        this.length = length;
    }

    @Override
    double getArea() {
        return width * length;
    }

    @Override
    double getPerimeter() {
        return 2 * (length + width);
    }
    
    @Override
    public String toString(){
        return "***Rectangle Class***\n"+
                "Length: "+length+
                "\nWidth: "+width;
          
    }
}
