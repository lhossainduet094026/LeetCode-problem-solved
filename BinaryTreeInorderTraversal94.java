class Solution {

   List<Integer> items = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if(root != null) {
			inorderTraversal(root.left);
			items.add(root.val);
			inorderTraversal(root.right);
		}

        return items;
    }
}
