import java.util.Scanner;

public class TaskFour{

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter number :");
    int number = input.nextInt(); 
    int factorial = 0;
    for(int count = number  ; count >= 1; count--){
       
       factorial = count * count;
    
    
    
    
    System.out.println(  factorial );
    
    }
    
    }

}
