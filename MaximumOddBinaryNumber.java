/*  
    2864. Maximum Odd Binary Number
    You are given a binary string s that contains at least one '1'.
    You have to rearrange the bits in such a way that the resulting binary number is the maximum odd binary number that can be created from this combination.
    Return a string representing the maximum odd binary number that can be created from the given combination.
    Note that the resulting string can have leading zeros.

 

Example 1:
Input: s = "010"
Output: "001"
Explanation: Because there is just one '1', it must be in the last position. So the answer is "001".

Example 2:
Input: s = "0101"
Output: "1001"
Explanation: One of the '1's must be in the last position. The maximum number that can be made with the remaining digits is "100". So the answer is "1001".
 
 */


public class MaximumOddBinaryNumber {



    public String maximumOddBinaryNumber(String binaryString) {
        int countOnes = 0;
        StringBuilder resultBuilder = new StringBuilder();
        
        for (char ch : binaryString.toCharArray()) {
            if (ch == '1') {
                countOnes++;
            }
        }
        
        for (int i = 0; i < binaryString.length() - 1; i++) {
            if (countOnes > 1) {
                countOnes--;
                resultBuilder.append('1');
            } else {
                resultBuilder.append('0');
            }
        }
        
        resultBuilder.append('1');
        return resultBuilder.toString();
    }
    public static void main(String[] args) {
        
    }
    
}
