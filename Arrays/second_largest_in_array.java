/*
    RAVAN_2070
    Problem: Find the second largest element in an array

    Complete reference:
    1] https://www.geeksforgeeks.org/problems/second-largest3735/1
    2] https://takeuforward.org/data-structure/find-second-smallest-and-second-largest-element-in-an-array
    
    Edge cases:
    1] All elements are equal hence value returned must be -1
    
    Time Complexity : 
    Worst case scenario: O(n) as all the elements  needs to be compared once to find the maximum value and second maximum
    
    Space Complexity : 
    Worst case scenario: O(1) as we are using a two variables (constant count)
   
*/
//OPtimized Solution
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        
        int maxElement, secondMaxElement;
        maxElement = secondMaxElement = -1; //As possible range of values starts from 0;
        
        int i;
        for(i = 0; i < arr.length; i++)
        {
            if(arr[i] > maxElement)
            {
                secondMaxElement = maxElement;
                maxElement = arr[i];
            }
            else if(arr[i] > secondMaxElement && arr[i] != maxElement)
            {
                secondMaxElement = arr[i];
            }
        }
        
        return secondMaxElement;
    }
}
/*  Solution 1
    Time Complexity : 
    Worst case scenario: O(n) as all the elements  needs to be compared twice to find the maximum value and second maximum
    
    Space Complexity : 
    Worst case scenario: O(1) as we are using a two variables (constant count)

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        
        int maxElement, secondMaxElement;
        maxElement = secondMaxElement = -1; //As possible range of values starts from 0;
        
        int i;
        for(i = 0; i < arr.length; i++)
        {
            maxElement = Math.max(maxElement, arr[i]);
        }
        
        for(i = 0; i < arr.length; i++)
        {
            if(arr[i] < maxElement && arr[i] > secondMaxElement)
            {
                secondMaxElement = arr[i];
            }
        }
        
        return secondMaxElement;
    }
}

*/