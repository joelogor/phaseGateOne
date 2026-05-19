import java.util.Scanner;

public class TaskSeven{

    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter radius :");
    
    double radius = input.nextInt();
    
    double area = 3.14 * (radius*radius);
     
    
    System.out.println( " Area = " + area);
    
    
    }

}
