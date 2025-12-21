import java.util.ArrayList;

class Solution {

    ArrayList<Integer> removeDuplicates(int[] arr) {

        ArrayList<Integer> result = new ArrayList<>();

        int n = arr.length;
        if (n == 0) return result;

        result.add(arr[0]);

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }

        return result;
    }
}
