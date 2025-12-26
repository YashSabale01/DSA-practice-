import java.util.ArrayList;

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        
        int start = 0;
        int currSum = 0;

        for (int end = 0; end < arr.length; end++) {
            currSum += arr[end];

            while (currSum > target && start <= end) {
                currSum -= arr[start];
                start++;
            }
            if (currSum == target) {
                res.add(start + 1); 
                res.add(end + 1);
                return res;
            }
        }
   
        res.add(-1);
        return res;
    }
}
