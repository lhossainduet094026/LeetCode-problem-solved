class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        if (root == null)
			return 0;

		int rangeSum = 0;

			if (low <= root.val && root.val <= high) {
				rangeSum += root.val;
			}

			if (root.val > low) {
				rangeSum += rangeSumBST(root.left, low, high);
			}

			if (root.val < high) {

				rangeSum += rangeSumBST(root.right, low, high);
			}

		return rangeSum;
    }
}
