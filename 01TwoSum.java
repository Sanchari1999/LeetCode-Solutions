//Define a public class
class Solution {

    //Define a public method  that takes an array of integers called nums and an integer called target as parameters and returns an array of integers
    public int[] twoSum(int[] nums, int target) 
    {

        //Declaring an integer array called result with a length of 2, which will store the indices of the two numbers that add up to target
        int[] result = new int[2]; 

        //Declaring an integer called n and initializes it to the length of the input array nums
        int n = nums.length; 
        
        //Starting a loop that iterates over the array nums from the first element to the last element
        for (int i = 0; i < n; i++) {
            
            //Starting a nested loop that iterates over the remaining elements of the array nums, starting from the element after the current element i
            for (int j = i + 1; j < n; j++) {
                
                //Checking if the sum of the current two elements equals target
                if (nums[i] + nums[j] == target) {
                    
                    //Storing the indices of the numbers adding upto the target
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        //Returning an empty array if no pair of elements adds up to target
        return new int[0];
    }
}
