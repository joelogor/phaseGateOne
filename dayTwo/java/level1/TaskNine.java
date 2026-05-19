import java.util.Scanner;

public class TaskNine{

    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter price :");
    
    int price = input.nextInt();
    
    double pricePlusTax = price + (0.1*price);
        
    
    System.out.println(" Price with tax = : " + pricePlusTax  );
    
    
    }

}
