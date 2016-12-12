public class ListIntSet implements IntSet {
	private Node root;
	
	public ListIntSet() {
		this.root = null;
	}

	public void add(int value) {
		Node node = new Node(value);
		
		if (this.root == null) {
			this.root = node;
			return;
		}
		
		Node current = this.root;
		
		while (current.next != null) {
			current = current.next;
		}
		
		if (current.value == value) {
			return;
		}

		current.next = node;
	}

	public boolean contains(int value) {
		if (this.root == null) {
			return false;
		}
		
		Node current = this.root;
		
		while (current.next != null) {
			if (current.value == value) {
				return true;
			}
			
			current = current.next;
		}

		return false;
	}

	public boolean containsVerbose(int value) {
		if (this.root == null) {
			return false;
		}
		
		Node current = this.root;
		
		while (current.next != null) {
			System.out.println("The current value of this node is: " + current.value);
			
			if (current.value == value) {
				return true;
			}
			
			current = current.next;
		}

		return false;
	}

	public String toString() {
		String str = "";
		
		if (this.root == null) {
			return str;
		}
		
		Node current = this.root;
		
		while (current.next != null) {
			str += current.value + ", ";
			
			current = current.next;
		}
		
		return str;
	}

}