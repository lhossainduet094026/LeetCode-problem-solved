class Solution {
    List<Integer> items = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root != null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
            items.add(root.val);
		}
        
        return items;
    }
}
