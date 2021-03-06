public class IntegerTreeNode {
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;
	
	public IntegerTreeNode(int value) {
		this.value = value;
	}
	
	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);
				return;
			}

			right.add(newNumber);
			return;
		}

		if (left == null) {
			left = new IntegerTreeNode(newNumber);
			return;
		}

		left.add(newNumber);
	}
	
	public boolean contains(int n) {
		if (n == this.value) {
			return true;
		}

		if (n > this.value) {
			return right == null ? false : right.contains(n);
		}
		
		return left == null ? false : left.contains(n);
	}
	
	public int getMax() {
		if (right == null) {
			return this.value;
		}
		
		return this.right.getMax();
	}
	
	public int getMin() {
		if (left == null) {
			return this.value;
		}
		
		return this.left.getMin();
	}
	
	public String toString() {
		String tree = "[" + this.value + " L";
		
		if (left != null) {
			tree += left.toString();
		} else {
			tree += "[]";
		}
		
		tree += " R";
		
		if (right != null) {
			tree += right.toString();
		} else {
			tree += "[]";
		}
		
		tree += "]";
		
		return tree;
	}
	
	public String toStringSimplified() {
		String tree = "[" + this.value;
		
		if (left != null) {
			tree += " " + left.toStringSimplified();
		}
		
		if (right != null) {
			tree += " " + right.toStringSimplified();
		}
		
		return tree + "]";
	}
	
	public int depth() {
		int totalDepth = 0;
		
		if (left != null || right != null) {
			totalDepth = 1;
		}
		
		int leftDepth = 0;
		
		if (left != null) {
			leftDepth = left.depth();
		}
		
		int rightDepth = 0;
		
		if (right != null) {
			rightDepth = right.depth();
		}
		
		totalDepth += leftDepth > rightDepth ? leftDepth : rightDepth;
		
		return totalDepth;
	}

}