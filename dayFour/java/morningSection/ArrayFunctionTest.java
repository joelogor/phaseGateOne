import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ArrayFunctionTest{

    @Test
    
    public void TestThatIPassAnArrayIRemoveTheDuplicateNumberInIt(){
    
      int[]number = {2,2,3,4,5,6};
      
      int []expected = {2,3,4,5,6};
      
      int []actual = ArrayFunction.removeDuplicate(new int[2]);
      
      assertArrayEquals(expected, actual);
      
      
    }
    
    
            
}        
        
 
