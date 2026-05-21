public class ArrayFunction {

    
    
    public static int[] removeDuplicate(int[]number){
    
    int[] array = new int [2];
    
        for(int index= 0; index < array.length; index ++){
        
            for(int count = index; count < array.length; count++ ){
                
                for(int count2 = index +1 ; count < array.length; count++ ){
                    
                    if (array[count] != array[count2]){
                        
                       array[count] = (array[index]);
                        
                        
                        
                    }
                }
            }
        }
        
            
                return array;
                
        
    }
    
    public static int[] rearrangeAscending(int[]number){
    
    int[] array = new int [2];
    
        for(int index= 0; index < array.length; index ++){
        
            for(int count = index; count < array.length; count++ ){
               temp_number =  (array[count];
                for(int count2 = index +1 ; count < array.length; count++ ){
                    
                    
                    if (array[count] < array[count2]){
                        
                       array[count] = (array[index]);
                        
                        
                        
                    }
                }
            }
        }
        
            
                return array;
                
        
    }
    

    
}
