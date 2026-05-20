import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ParkingSystemTest{

    @Test
    
    

    public void testThatEmptyArrayListGivesRrturnsAccurateMessage(){
  
        int []carSlot = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        expected = "Empty"
        actual = mini_parking_system.check_car_slot(0)
        assertEqual(actual,expected)
        }
    public void testThatEmptyArrayListGivesRrturnsAccurateMessage(){
  
        int []carSlot = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        expected = "Occupied"
        actual = mini_parking_system.check_car_slot(0)
        assertEqual(actual,expected)
        }
    public void testThatEmptyArrayListGivesRrturnsAccurateMessage(){
  

        int []carSlot = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        expected = "Available Space"
        actual = mini_parking_system.display_parking_status(0)
        assertEqual(actual,expected)
        }
        
    public void testThatEmptyArrayListGivesRrturnsAccurateMessage(){
  

        int []carSlot = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        expected = "Filled Space"
        actual = mini_parking_system.display_parking_status(0)
        assertEqual(actual,expected)
        }
    public void testThatEmptyArrayListGivesRrturnsAccurateMessage(){
  

        int []carSlot = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        expected = "Car slot available now"
        actual = mini_parking_system.unpacking_car(0)
        assertEqual(actual,expected)
        }
    public void testThatEmptyArrayListGivesRrturnsAccurateMessage(){
  

        int []carSlot = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        expected = "Not Left Yet"
        actual = mini_parking_system.unpacking_car(0)
        assertEqual(actual,expected)
        }       
        
}        
        
  
        
