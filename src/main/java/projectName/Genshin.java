package projectName;
import java.util.Scanner;
public class Genshin {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to Teyvat, Traveler!");
       // System.out.println("\nWould you like to play with Raiden?");

        //Archon object
        Raiden friend = new Raiden();
        Venti companion = new Venti();

        //get user choice
        int choice = 0;

        while (choice >= 0) {
            System.out.println("Type 1 for Raiden or 2 for Venti: ");
            choice = input.nextInt();
            input.nextLine();
            
            //if Raiden
            if (choice ==1) {
                
            
        
        //setWeapon
        System.out.print("\nWhich weapon will you use? \nWeapon: ");
        String weapon = input.nextLine();
        friend.setWeapon(weapon);

        //getMethod
        int age = friend.getAge();
        System.out.println("\nYour new friend is " + age + " years old!" + " They are excited to meet you. Their main weapon is " + weapon);
        
        //setMethod
        System.out.println("\nWhat are you going to call your friend?\nName: ");
        String name = input.nextLine();
        friend.setName(name);
        System.out.println("Great! This is " + name + " . ");
            }
            if (choice == 2) {
                System.out.println("Hey, I'm Venti! \n");
            }
        } //end if statement
    input.close();
        
    
    }
}


