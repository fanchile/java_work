package fiveth;
import java.util.Scanner;
public class QuadraticEquationClass_2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("input three number of a function");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		input.close();
		
		QuadraticEquationClass object=new QuadraticEquationClass(a,b,c);
		
		
		System.out.println("a value is "+object.getA());
		System.out.println("b value is "+object.getB());
		System.out.println("c value is "+object.getC());
		
		if(object.getDiscriminant()>0)
			System.out.println("b2-4ac>0,equation has two roots  r1:"+object.getRoot1()+" r2:"+object.getRoot2());
		else if(object.getDiscriminant()==0)
			System.out.println("b2-4ac=0,equation has one root r:"+object.getRoot1());
		else
			System.out.println("The equation has no roots.");
	}
}
