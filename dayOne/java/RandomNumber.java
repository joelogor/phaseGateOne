import java.util.Random;
import java.util.Scanner;
public class RandomNumber{

    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    for(int count = 1;count <= 5;count++){
      System.out.println("Enter  1 to 100 to guess number:");
    int guessNumber = sc.nextInt();
    if (guessNumber <= 1 || guessNumber > 100){
    System.out.println("Error");
        continue;
    }
        
    int randNum = randomNumber(1,100);
    
    
        System.out.println(randNum);
    
    if(randNum < guessNumber  ){
    
    System.out.println("randNum is lower");
    
    }
    else if(randNum > guessNumber  ){ 
    System.out.println("Number is higher");
    }
    if(randNum == guessNumber){
    
        break;
    }   
    }
    
    }

    public static int randomNumber(int numberStart, int numberStop){
   
    Random rand = new Random();
    int number = rand.nextInt(1, 100);
    
    
        return number;
        
     
       
    
    }









}
