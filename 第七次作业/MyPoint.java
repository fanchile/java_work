package siventh;
import java.util.ArrayList;
import java.util.Scanner;
public class MyPoint {
	private double x,y;
	 
	public MyPoint(){
	    x = 0;
	    y = 0;
	}
	 
	public MyPoint(double x, double y){
	    this.x = x;
	    this.y = y;
	}
	 
	public double getX(){
	    return x;
	}
	 
	public double getY(){
	    return y;
	}
	 
	public void setX(double x) {
	    this.x = x;
	}
	 
	public void setY(double y) {
	    this.y = y;
	}
	 
	public double distance(MyPoint p){
	    return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
	}
	 
	public double diatance(double x, double y){
	    return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
	}


public static void main(String[] args) {
    polygon polygon = new polygon();
    int pointNum = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("input the number of point:");
    pointNum=in.nextInt();
    for(int i=0;i<pointNum;i++)
    {
        System.out.println("input the "+i+" point x:");
        double x = in.nextDouble();
        System.out.println("input the "+i+" point y:");
        double y = in.nextDouble();
        MyPoint p1 = new MyPoint(x,y);
        polygon.setPoint(p1);
    }
    System.out.println("all point x and y:");
    polygon.out();
    System.out.println("the area is " + polygon.Area(pointNum));
	}
}
