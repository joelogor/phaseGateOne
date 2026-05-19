import java.util.Scanner;

public class TaskTen{

    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter first number:");
    
    int firstNumber = input.nextInt();
    System.out.println("Enter second number:");
    int secondNumber = input.nextInt();
    
    
    int larger = firstNumber;
    
    if(secondNumber > firstNumber){
        larger = secondNumber;
        }
    
    
        
    
    System.out.println("Larger number = " + larger );
    
    
    }

}
