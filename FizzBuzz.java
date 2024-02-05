/*
    412. Fizz Buzz
    Given an integer n, return a string array answer (1-indexed) where:

    answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    answer[i] == "Fizz" if i is divisible by 3.
    answer[i] == "Buzz" if i is divisible by 5.
    answer[i] == i (as a string) if none of the above conditions are true.
    

Example 1:

Input: n = 3
Output: ["1","2","Fizz"]
Example 2:

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
Example 3:

Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 */

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {


     public List<String> fizzBuzz(int n) {
        List <String> list = new ArrayList<>();

        for(int val = 1 ; val<= n; val++){
            if(val%3 ==0 && val%5 ==0 ){
                list.add("FizzBuzz");
            }
            else if(val%3 == 0){
                list.add("Fizz");
            }
            else if(val%5 == 0){
                list.add("Buzz");
            }
            else{

                list.add(Integer.toString(val));
            }
        }
        
        return list;
    }
    public static void main(String[] args) {
        
    }
    
}
