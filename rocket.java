import java.util.Scanner;

public class rocket{
	
	public static void main(String args[]){
		
		double thrust,mass,force,acceleration;
		
		Scanner obj1=new Scanner(System.in);
		
		System.out.println("Enter the thrust: ");
		thrust=obj1.nextDouble();
		
		System.out.println("Enter the mass: ");
		mass=obj1.nextDouble();
		
		force=thrust-mass*9.8;
		
		acceleration=force/mass;
		
		System.out.println("Acceleration: "+acceleration);
		
	}
}