package com.harman.assess;

import java.util.Scanner;
abstract class Shape
{
    int x,y;
    abstract public void printarea();
}
class Rectangle extends Shape
{
    public int rect_area;
    public void printarea()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle");
        x=s.nextInt();
        y=s.nextInt();
        rect_area=x*y;
        System.out.println("The area ofrectangle is:"+rect_area);
    }
}
class Square extends Shape
{
    double area_sqr;
    public void printarea()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the side of square");
        x=s.nextInt();
        area_sqr=(x*x);
        System.out.println("The area of square is:"+area_sqr);
    }
}
class Circle extends Shape
{
    double cir_area;
    public void printarea()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        x=s.nextInt();
        cir_area=(3.14*x*x);
        System.out.println("Area of circle is:"+cir_area);
    }
}
public class DisplayArea {
    public static void main(String[] args) {
        Rectangle recObj = new Rectangle();
        recObj.printarea();
        Square sqrObj = new Square();
        sqrObj.printarea();
        Circle cir = new Circle();
        cir.printarea();
    }
}

