const prompt = require ("prompt-sync");

let celsius = prompt("Enter temperature in celsius ");

let fahrenheit = (celsius* (9/5)) + 32
        

console.log( celsius " celsius to fahrenheit  = " , fahrenheit)
