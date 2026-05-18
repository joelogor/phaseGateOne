
    
    const prompt = require("prompt-sync");
    
    for(let count = 1;count <= 5;count++){
      console.log("Enter  1 to 100 to guess number:");
    let guessNumber = prompt("Enter 1 to 100");
    if (guessNumber <= 1 || guessNumber > 100){
    console.log("Error");
        continue;
    }
        
    int randNum = randomNumber(1,100);
    
    
        console.log(randNum);
    
    if(randNum < guessNumber  ){
    
    console.log("randNum is lower");
    
    }
    else if(randNum > guessNumber  ){ 
    console.log("Number is higher");
    }
    if(randNum == guessNumber){
    
        break;
    }   
    }
    
    }

    const rand_num = function randomNumber(numberStart, numberStop){
   
    Random rand = new Random();
    let number = rand.nextInt(1, 100);
    
    
        return number;
        
     
       
    
    }









}
