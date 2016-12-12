public class Launcher {
	public static void main(String[] args) {
		Launcher launcher = new Launcher();
		launcher.launch();
	}
	public void launch() {
		IntegerTreeNode root = new IntegerTreeNode(6);
		
		root.add(9);
		
		root.add(5);
		
		root.add(3);
		
		root.add(8);

		root.add(11);
		
		root.add(12);
		
		int maxValue = root.getMax();
		
		System.out.println(maxValue);
		
		int minValue = root.getMin();
		
		System.out.println(minValue);
		
		String tree = root.toString();
		
		System.out.println(tree);
		
		System.out.println("");
		
		String simplifiedTree = root.toStringSimplified();
		
		System.out.println(simplifiedTree);
		
		int depth = root.depth();
		
		System.out.println();
		
		System.out.println("Tree depth is: " + depth);
	}
}
