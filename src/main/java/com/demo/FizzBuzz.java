package com.demo;

public class FizzBuzz 
{
    String processNumber(int num)
	{	
    	// Copy your code here
		if (num%3 == 0 && num%5 == 0){
          return "Fizz Buzz";
        } else if (num%3 == 0) {
          return "Fizz";
        } else if (num%5 == 0) {
          return "Buzz";
        } else
          return ""+num;
	}
	
	String processNumbers (int[] numList)
	{
    	// Copy your code here
		int length = numList.length;
        String result = "";
        for(int i = 0; i < length-1; i++){
          result += (String) processNumber(numList[i]) + ", ";
        }
        return result + (String) processNumber(numList[length-1]);
	}

}
