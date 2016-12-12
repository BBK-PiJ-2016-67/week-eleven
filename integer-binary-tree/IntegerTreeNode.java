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

}