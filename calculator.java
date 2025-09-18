
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter first number (a) : ");
        int a = sc.nextInt();

        System.out.println("Enter second number (b) : ");
        int b = sc.nextInt();

        System.out.println("choose operation :");
        System.out.println("1) : Addition (+)");
        System.out.println("2) Subtraction (-)");
        System.out.println("3) Multiplication (*)");
        System.out.println("4) Divison (/)");
        System.out.println("5) Modulo (%)");
        System.out.println("Enter a choice (1-5): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:System.out.println("Result : " + (a + b));
                break;
            case 2:System.out.println("Result : " + (a - b));
                break;
            case 3:System.out.println("Result : " + (a * b));
                break;    
            case 4:System.out.println("Result : " + (a / b));
                break;
            case 5:System.out.println("Result : " + (a % b));
                break;  
            default:System.out.println("Invalid choice");
                break;     
           
        }
    }

        

       

        
    }
    
}
