import java.util.*;

public class Permutations{
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // Start the backtracking algorithm
        backtrack(nums, new ArrayList<>(), result);
        return result;
    }
     private void backtrack(int[] nums, List<Integer> current, List<List<Integer>> result) {
        // If the current permutation is complete, add it to the result
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Explore each element in nums and add it to the current permutation
        for (int i = 0; i < nums.length; i++) {
            // Skip if the element is already in the current permutation
            if (current.contains(nums[i])) continue;

            // Add the element to the current permutation
            current.add(nums[i]);

            // Recurse and generate permutations with the current element added
            backtrack(nums, current, result);

            // Backtrack by removing the last element added, restoring the previous state
            current.remove(current.size() - 1);
        }
     }
}