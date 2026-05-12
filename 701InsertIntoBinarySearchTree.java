class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
       TreeNode newNode;
        if (root == null) {
			return new TreeNode(val);
		} else {
            newNode = new TreeNode(val);
			TreeNode current = root;
			TreeNode parent;
			while (true) {

				parent = current;
				if (val < current.val) {
					current = current.left;

					if (current == null) {
						parent.left=newNode;
						return root;
					}
				} else {
					current = current.right;
					if (current == null) {
						parent.right=newNode;
						return root;
					}
				}
			}
		}
    }  
}
