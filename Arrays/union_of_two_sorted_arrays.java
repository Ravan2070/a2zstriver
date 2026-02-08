/*
    RAVAN_2070
    Problem: Union of 

    Pattern:Merge Operation + Two pointers

    Learning: 
    Variation of Merge, we can avoid inserting duplicate elements in arraylist in case parent arrays are sorted.
    Since both arrays are sorted, use two pointers to traverse them together and merge like merge sort.
At each step, add the smaller element (or one if equal) while skipping duplicates, then move the pointer(s).
Finally, append any remaining elements, resulting in a union in linear time without extra space.

    Complete reference:
    1] https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1
    2] https://takeuforward.org/data-structure/union-of-two-sorted-arrays
    
    Optimal Solution [Accepted] 

    Time Complexity : 
    Worst case scenario: O(n + m) as we need to traverse both arrays completely once
    
    Space Complexity : 
    Worst case scenario: O(n+m) as we are using a new ArrayList to store distinct elements

  */
class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> distinct = new ArrayList<Integer>();
        
        int n, m, i, j;
        n = a.length;
        m = b.length;
        
        i = j = 0;
        while(i < n && j < m)
        {
            if(a[i] <= b[j])
            {
                insert(distinct, a[i]);
                i++;
            }
            else
            {
                insert(distinct, b[j]);
                j++;
            }
        }
        
        while(i < n)
        {
            insert(distinct, a[i]);
            i++;
        }
        
        while(j < m)
        {
            insert(distinct, b[j]);
            j++;
        }
        
        return distinct;
    }
    
    static void insert(ArrayList<Integer> nums, int element)
    {
        int length = nums.size();
        if(length == 0 || nums.get(length - 1) != element)
        {
            nums.add(element);
        }
    }
}
