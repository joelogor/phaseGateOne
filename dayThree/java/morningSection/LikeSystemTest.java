import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LikeSystemTest{

    @Test
    
    public void testThatEmptyArrayListGivesRrturnsAccurateMessage(){
    
    String[] likes = new String[0];
    
    String expected = "no one likes this";
    
    String actual = LikeSystem.displayText( new String[]{});
    assertEquals(actual,expected);
    
    }








}
