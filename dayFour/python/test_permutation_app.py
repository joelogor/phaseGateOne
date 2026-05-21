from unittest import TestCase

import permutation_app 


class Test_Permution_App(TestCase):

    def tes_that_i_pick_two_numbers_in_list_the_sumation_gives_the_number_outside_the_list(self):
    
        number = [8,6,12,4,-2],6;
        num = 6
        expected = [8,-2]
        actual = permutation_app.get_permutation(index_numbers, num)
        Assertions.assertarrayEquals(actual, expected )
