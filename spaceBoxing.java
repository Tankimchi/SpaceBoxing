import java.util.Scanner;
public class SpaceBoxing {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double Venus = 0.78, Mars = 0.39, Jupiter = 2.65, Saturn = 1.17, Uranus = 1.05, Neptune = 1.23;
		int weight;
		
		System.out.print("Please enter your current Earth weight: ");
			weight = keyboard.nextInt();
			
		System.out.println("\nI have information for the following planets: ");
		System.out.println("   1. Venus   2. Mars   3.Jupiter");
		System.out.println("   4. Saturn  5. Uranus 6. Neptune");
		
		System.out.println("\nWhich planet are you visiting? ");
			int planet = keyboard.nextInt();
			
		
		if (planet == 1) {
			System.out.println("\n Your weight would be " + (weight * Jupiter));
		}
		else if (planet == 2)  {
			System.out.println("\n Your weight would be " + (weight * Mars));
		} 
		else if (planet == 3) {
			System.out.println("\n Your weight would be " + (weight * Venus));
		}
		else if (planet == 4) {
			System.out.println("\n Your weight would be " + (weight * Saturn));
		}
		else if (planet == 5) {
			System.out.println("\n Your weight would be " + (weight * Uranus));	
		}
		else if(planet == 6)	{
			System.out.println("\n Your weight would be " + weight * Neptune);
		}
		
	}
