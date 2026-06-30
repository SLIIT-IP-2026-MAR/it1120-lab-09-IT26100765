import java.util.Scanner;

public class IT26100765Lab9Q2{
	public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the radius od ther circle: ");
	double radius = input.nextDouble();
	
	
	double area = circleArea(radius);
	System.out.println("The area of the circle with radius" + radius + "is" + area);
	}
	public static double circleArea (double radius){
	
	return Math.PI * radius * radius;
	}
	
	
	
	
	}




