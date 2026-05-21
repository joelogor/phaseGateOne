public class ArrayFunction {

    
    
    public static int[] removeDuplicate(int[]number){
    
    int[] number = new int []
    
        for(int index= 0; index < number.length; index ++){
        
            for(int count = index; count < number.length; count++ ){
                
                for(int count2 = index +1 ; count < number.length; count++ ){
                    
                    if (number[count] != number[count2]){
                        
                       number.append(number[count]);
                        
                        return number;
                        
                    }
                }
            }
        }
        
            
    
                
        
    }
    
//    
//  public static int[] arrangeAscending(int[]number){
//    
//    int[] number = new int []
//    
//        for(int index= 0; index < number.length; index ++){
//        
//            for(int count = index; count < number.length; count++ ){
//                
//                for(int count2 = index +1 ; count < number.length; count++ ){
//                    
//                    if (number[count] < number[count2]){
//                        
//                       number.append(number[count]);
//                        
//                        return number;
//                        
//                    }
//                }
//            }
//        }
//        
//            
//    
//                
//        
//    }
//
//    
}
