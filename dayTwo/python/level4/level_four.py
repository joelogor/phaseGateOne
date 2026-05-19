def add(first_number, second_number):
    return first_number + second_number

def checkNumber(number):
    if number %2 == 0:
        print("Even")
    else:
        print("Odd")
def square(number):
    return number**2
    
def celsiusToFahrenheit(celsius):
    return (celsius* (9/5)) + 32

def largestNumber(firstNumber, secondNumber, thirdNumber):
    largest = firstNumber
    if(secondNumber > firstNumber):
        largest = secondNumber
        
    elif (thirdNumber > secondNumber):
        
        largest = thirdNumber
        
        print(largest)
        
    
    
    
    
    
    
    
    
    
      
    
print(add(2,3))
checkNumber(3)
print(square(3))
print(celsiusToFahrenheit(3))
largestNumber(1,2,3)












