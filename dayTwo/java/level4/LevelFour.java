public class LevelFour{

    public static void main(String[] args){
   
   System.out.println(add(2,4));
   checkEvenNumber(4);
   System.out.println(square(4));
   System.out.println(celsiusToFahrenheit(4));
   System.out.println(areaOfRectangle(5,2));
   System.out.println(simpleInterest(5000,2.5,2));
   largestNumber(5000,2,2);
   
   
   
   

    }

    public static int add(int firstNumber, int secondNumber){
    
         return  firstNumber + secondNumber;
    }
    
     public static void  checkEvenNumber(int number){
     
     if(number %2 == 0){
       System.out.println("Even");
       }
     else{
     System.out.print("Odd");
     }
      
    }
    public static int square(int number){
    
        return number * number;
    }
    
    public static double celsiusToFahrenheit(double celsius){
    
        return (celsius*(9/5)) + 32;
    }
   
    public static double areaOfRectangle(double width, double length){
    
        return width * length;
    }
     public static double simpleInterest(double principal, double rate, double time){
    
        return (principal * rate * time)/100;
    }
    public static void largestNumber(int firstNumber, int secondNumber, int thirdNumber){
        int largest = firstNumber;
        if(secondNumber > firstNumber){
        largest = secondNumber;
        }
        else if (thirdNumber > secondNumber){
        largest = thirdNumber;
        }
        System.out.println(largest);
        }
}


























