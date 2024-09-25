import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class SymmetricTree {
     public boolean isSymmetric(TreeNode root) {
          // An empty tree is symmetric
        if (root == null) return true;
        
        // Initialize a queue to check nodes in pairs
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        
        // Process nodes in pairs
        while (!queue.isEmpty()) {
            TreeNode t1 = queue.poll();
            TreeNode t2 = queue.poll();
            
            // If both nodes are null, continue
            if (t1 == null && t2 == null) continue;
            
            // If one node is null or values are different, return false
            if (t1 == null || t2 == null || t1.val != t2.val) return false;
            
            // Enqueue children in opposite order for comparison
            queue.add(t1.left);
            queue.add(t2.right);
            queue.add(t1.right);
            queue.add(t2.left);
        }
        
        return true;

    }
}
