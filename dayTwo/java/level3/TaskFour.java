import java.util.Scanner;

public class TaskFour{

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter number :");
    int number = input.nextInt(); 
    int product = 0;
    for(int count = 1; count <= 12; count ++){
        product = count * number;
    
    
    
    System.out.println(number + " X " + count + " = " + product  );
    
    
    
    }
    
    }

}
