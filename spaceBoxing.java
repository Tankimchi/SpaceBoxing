import java.util.Scanner;

class spaceBoxing {
    public static void main (String [] args) {
        
        Scanner keyboard = new Scanner(System.in);
           /* 
            Venus = 0.78;
            Mars = 0.39;
            Jupiter = 2.65;
            Saturn = 1.17;
            Uranus = 1.05;
            Neptune = 1.23;
            */
        
        System.out.println("Please enter your current earth weight: ");
        System.out.print("\n> ");
            int weight = keyboard.nextInt();
        System.out.print("I have information on the following planets: ");
        System.out.println();
            System.out.print("\n1. Venus  2. Mars   3. Jupiter");
            System.out.print("\n4. Saturn 5. Uranus 6. Neptune");
                System.out.println();
            System.out.print("\nWhich planet are you visiting? ");
                System.out.print("\n> ");
                int planet = keyboard.nextInt();
            
        if (planet == 1) {
            System.out.println("Your weight would be: " + (weight * 0.78 ) + " pounds on that planet.");
        } else if (planet == 2) {
            System.out.println(" Youre weight would be: "+ (weight * 0.39 ) + " pounds on that planet. ");
        } else if (planet == 3) {
            System.out.println(" Youre weight would be: "+ (weight * 2.65 ) + " pounds on that planet. ");
        } else if (planet == 4) {
            System.out.println(" Youre weight would be: "+ (weight * 1.17 ) + " pounds on that planet. ");
        } else if (planet == 5) {
            System.out.println(" Youre weight would be: "+ (weight * 1.05 ) + " pounds on that planet. ");
        } else if (planet == 6) {
            System.out.println(" Youre weight would be: "+ (weight * 1.23 ) + " pounds on that planet. ");
        }
        
        
        
    }
}