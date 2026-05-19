import java.util.Scanner;

public class TaskFive{

    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter temperature in celsius :");
    
    int celsius = input.nextInt();
    
    int fahrenheit = (celsius*(9/5)) + 32;
        
    
    System.out.println( celsius + "celsius to Fahrenheit = "  + fahrenheit );
    
    
    }

}
