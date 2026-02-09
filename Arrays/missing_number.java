 /*
    RAVAN_2070
    Problem: Missing number

    Pattern: Maths & Bitwise

    Learning: 
    1]The sum of the first n natural numbers is given by the formula (n * (n + 1)) / 2. The idea is to compute this sum and subtract the sum of all elements in the array from it to get the missing number.
    2]XOR of a number with itself is 0 i.e. x ^ x = 0 and the given array arr[] has numbers in range [1, n]. This means that the result of XOR of first n natural numbers with the XOR of all the array elements will be the missing number. To do so, calculate XOR of first n natural numbers and XOR of all the array arr[] elements, and then our result will be the XOR of both the resultant values.

    Complete reference:
    1] https://leetcode.com/problems/missing-number/
    2] https://www.geeksforgeeks.org/dsa/find-the-missing-number/
    
    Optimal Solution 1 [Maths] [Accepted] 

    Time Complexity : 
    Worst case scenario: O(n) as we need to traverse through array to find sum.
    
    Space Complexity : 
    Worst case scenario: O(1) as we are using constant count of variables 

    Optimal Solution 2 [XOR] [Accepted] 

    Time Complexity : 
    Worst case scenario: O(n) as we need to traverse through array to find xor.
    
    Space Complexity : 
    Worst case scenario: O(1) as we are using constant count of variables 

  */
class Solution {
    public int missingNumber(int[] nums) {

        int i, xorOfArray, xorOfFirstN;
        xorOfArray = xorOfFirstN = 0;

        for(i = 0; i < nums.length; i++)
        {
            xorOfArray = xorOfArray ^ nums[i];
            xorOfFirstN = xorOfFirstN ^ (i + 1);
        }

        return (xorOfArray ^ xorOfFirstN);
        
    }
}
/**
    Optimal Solution 1 [Maths] [Accepted] 

    Time Complexity : 
    Worst case scenario: O(n) as we need to traverse through array to find sum.
    
    Space Complexity : 
    Worst case scenario: O(1) as we are using constant count of variables.

    class Solution {
    public int missingNumber(int[] nums) {

        int i, sumOfArray, sumOfFirstN;
        sumOfArray = sumOfFirstN = 0;

        for(i = 0; i < nums.length; i++)
        {
            sumOfArray += nums[i];
        }

        int N = nums.length;
        sumOfFirstN = (N * (N + 1)) / 2;

        return (sumOfFirstN - sumOfArray);
        
    }
}

 */ {
    
}
