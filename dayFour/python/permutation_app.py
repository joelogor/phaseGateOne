def get_permutation( numbers, num):
    
    numbers = {8,6,12,4,-2},6;
    num = 6
    for number in range(len(numbers)) :
        two_numbers = False
       
        for count in range(number+1, len(numbers)):
            if numbers[number] + numbers[count] == num:
                numbers.append(numbers[count])
                two_number = True
                break
        if(two_number):
            numbers.append(numbers[number])
            
            return numbers
        
            
           
            
#print(get_permutation({2,3,4,5,7},6))    
