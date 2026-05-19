import java.util.Scanner;

public class TaskTen{

    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter first number:");
    
    int firstNumber = input.nextInt();
    System.out.println("Enter second number:");
    int secondNumber = input.nextInt();
    
    System.out.println("Enter third number:");
    int thirdNumber = input.nextInt();
    
    int sum  =firstNumber + secondNumber + thirdNumber ;
    
    double average = sum/3;
        
    
    System.out.println(" Average = : " + average );
    
    
    }

}
