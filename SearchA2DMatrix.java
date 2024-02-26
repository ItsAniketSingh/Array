/*
    74. Search a 2D Matrix
    You are given an m x n integer matrix matrix with the following two properties:

    Each row is sorted in non-decreasing order.
    The first integer of each row is greater than the last integer of the previous row.
    Given an integer target, return true if target is in matrix or false otherwise.

    You must write a solution in O(log(m * n)) time complexity.

    

Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
 */


public class SearchA2DMatrix {


    public boolean bruteForce(int[][] matrix, int target){
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0 ;j < matrix[i].length; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length ;
        int col = matrix[0].length ;
        int r=0 ;
        for(int i=0 ; i<rows ; i++){
            if(matrix[i][col-1]>=target){
                r = i ;
                break ;
            }
        }
        for(int i=0 ; i<col ; i++){
            if(matrix[r][i]==target){
                return true ;
            }
        }
        return false ;
    }
    public static void main(String[] args) {
        
    }
    
}
