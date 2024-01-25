/*
    43. Multiply Strings
    Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

    Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

 

Example 1:

Input: num1 = "2", num2 = "3"
Output: "6"
Example 2:

Input: num1 = "123", num2 = "456"
Output: "56088"
 
 */

import java.math.BigInteger;

public class MultiplyStrings {

    // the Answer can be more optimized
    // first way
    public String multiply1(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        int sum = n1 * n2;
        return Integer.toString(sum);
        
    }
    // Second way
    public String multiply2(String num1, String num2) {
        BigInteger big1 = new BigInteger(num1);
        BigInteger big2 = new BigInteger(num2);
        BigInteger result = big1.multiply(big2);
        return result.toString();
    }
    public static void main(String[] args) {
        
    }
    
}
