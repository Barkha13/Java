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
public abstract class Shape {
    
    protected String color;
    protected boolean filled;
    
    public Shape(){
//        this.color = "black";
        this.filled = false;
        
    }
    
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor(){
        return color;
    } 
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public void isFilled(boolean filled){
        this.filled = filled;
    }
    
    abstract double getArea();
    abstract double getPerimeter();
    
    @Override
    public String toString(){
        return "****Shape Class***\n"+
                color+"..."+
                filled;
    }
    

    /**
     * @param args the command line arguments
     */
 
}
