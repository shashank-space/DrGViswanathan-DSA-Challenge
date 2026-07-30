class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Day39PathSum {

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        targetSum -= root.val;

        // If it's a leaf node
        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }

        return hasPathSum(root.left, targetSum) ||
               hasPathSum(root.right, targetSum);
    }

    public static void main(String[] args) {
        /*
                5
              /   \
             4     8
            /     / \
           11    13  4
          /  \
         7    2
        */

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);

        int targetSum = 22;

        boolean result = hasPathSum(root, targetSum);

        System.out.println("Target Sum: " + targetSum);
        System.out.println("Path Exists: " + result);
    }
}
