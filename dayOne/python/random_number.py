import Random

    for(int count = 1;count <= 5;count++){
        print("Enter  1 to 100 to guess number:");
        guessNumber = sc.nextInt();
        if (guessNumber <= 1 || guessNumber > 100){
            print("Error");
        continue;
    }
        
    randNum = getRandomNumber(1,100);
    
    
        print(randNum);
    
    if(randNum < guessNumber  ){
    
        print("randNum is lower");
    
    }
    else if(randNum > guessNumber  ){ 
        print("Number is higher");
    }
    if(randNum == guessNumber){
    
        break;
    }   
    }
    
    }

  
    
    
    
    
    
    def getRandomNumber(number_start, number_stop){
    
        number = random.randint(1,100)
    }
