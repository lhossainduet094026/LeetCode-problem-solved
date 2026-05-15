public int depth(Node root) {
		if (root == null) {
			return 0;
		} else {
			int leftDepth = depth(root.getLeftNode());
			int rightDepth = depth(root.getRightNode());
			return 1 + Math.max(leftDepth, rightDepth);
			
		}
	}
