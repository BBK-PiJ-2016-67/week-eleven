public class TreeIntSet implements IntSet {
	private int value;
	private TreeIntSet left;
	private TreeIntSet right;
	
	public TreeIntSet(int value) {
		this.value = value;
	}

	public void add(int value) {
		if (value > this.value) {
			if (right == null) {
				right = new TreeIntSet(value);
				return;
			}

			right.add(value);
			return;
		}

		if (left == null) {
			left = new TreeIntSet(value);
			return;
		}

		left.add(value);
	}

	public boolean contains(int value) {
		if (value == this.value) {
			return true;
		}

		if (value > this.value) {
			return right == null ? false : right.contains(value);
		}
		
		return left == null ? false : left.contains(value);
	}

	public boolean containsVerbose(int value) {
		System.out.println("The value of this node is " + this.value);
		
		if (value == this.value) {
			return true;
		}

		if (value > this.value) {
			return right == null ? false : right.containsVerbose(value);
		}
		
		return left == null ? false : left.containsVerbose(value);
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

}