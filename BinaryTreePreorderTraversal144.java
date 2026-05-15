class Solution {
    List<Integer> items = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        
        if (root != null) {
			items.add(root.val);
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}

        return items;
    }
}
