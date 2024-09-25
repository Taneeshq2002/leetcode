public class ConstructBtree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return constructBST(nums, 0, nums.length - 1);
    }
    private TreeNode constructBST(int[] nums, int left, int right) {
        // Base case: If the left index exceeds the right, return null
        if (left > right) {
            return null;
        }

        // Find the middle element to make it the root
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        // Recursively build the left subtree with the left half of the array
        node.left = constructBST(nums, left, mid - 1);

        // Recursively build the right subtree with the right half of the array
        node.right = constructBST(nums, mid + 1, right);

        return node;
    }
}
