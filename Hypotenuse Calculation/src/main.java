
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        System.out.println("Welcome");
        System.out.println("To calculate the hypotenuse of the desired triangle, you must enter the length of 2 sides");
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter the length of the first side");
        double first_side = scanner.nextDouble();
        
        System.out.println("Enter the length of the second side");
        double second_side = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println("Enter the length unit you use");
        String lenght_unit = scanner.nextLine();
        
        double hypotenuse = Math.sqrt((first_side * first_side) + (second_side * second_side)) ;
        System.out.println("Your Hypotenuse Length is =" + hypotenuse + " " + lenght_unit) ;
        
        
                
    }
}
