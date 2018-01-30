import java.util.Scanner;

public class CircleMath {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter radius: ");
		double radius = input.nextDouble();
		System.out.printf("Radius: %.0f\n", radius);
		System.out.printf("Diameter: %.2f\n", radius*2);
		System.out.printf("Circumference: %.2f\n", radius*2*Math.PI);
		System.out.printf("Area: %.2f\n", radius*radius*Math.PI);
		
		input.close();
	}
}
