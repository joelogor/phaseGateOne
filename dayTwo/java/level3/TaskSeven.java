import java.util.Scanner;

public class TaskFour{

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter 5 numbers :");
    int number;
    
    int sum = 0;
    for(int count = 1; count <= 5; count ++){
    
    number = input.nextInt(); 
    
        sum +=  number;
    
    
    
    
    
    
    }
    System.out.println(sum  );
    
    }

}
