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
public class Square extends Rectangle {
    
    public double side;
    
    public Square(){
        
    }
    public Square(double side){
        this.side = side;
    }
    public Square(double side,String color,boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }
    
    @Override
    public void setWidth(double side){
        this.width = side;
    } 
    @Override
    public void setLength(double side){
        this.length = side;
    } 
    @Override
    public String toString(){
        return "***Square Class***\n"+
                "Length: "+length+
                "\nWidth: "+width;
    }
}
