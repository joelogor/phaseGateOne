from unittest import TestCase
import mini_parking_sytem


class Test_Mini_Parking_System(TestCase):

    def test_that_car_slot_is_empty_car_enter_slot(self):

        car_slot = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
        expected = "Empty"
        actual = mini_parking_system.check_car_slot(0)
        assertEqual(actual,expected)
        
    def test_that_car_slot_is_occupied_car_cannot_enter_slot(self):

        car_slot = [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
        expected = "Occupied"
        actual = mini_parking_system.check_car_slot(0)
        assertEqual(actual,expected)
        
    def test_that_i_enter_car_slot_number_i_know_its_available(self):

        car_slot = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
        expected = "Available Space"
        actual = mini_parking_system.display_parking_status(0)
        assertEqual(actual,expected)
        
    def test_that_i_enter_car_slot_number_i_know_its_filled(self):

        car_slot = [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
        expected = "Filled Space"
        actual = mini_parking_system.display_parking_status(0)
        assertEqual(actual,expected)

    def test_that_car_leave_slot_it_display_now_available(self):

        car_slot = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
        expected = "Car slot available now"
        actual = mini_parking_system.unpacking_car(0)
        assertEqual(actual,expected)
        
    def test_that_car_leave_slot_it_display_now_available(self):

        car_slot = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
        expected = "Not Left Yet"
        actual = mini_parking_system.unpacking_car(0)
        assertEqual(actual,expected)
                
        
        
        
  
        
