public class Launcher {
	public static void main(String[] args) {
		Launcher launcher = new Launcher();
		launcher.launch();
	}
	public void launch() {
		IntegerTreeNode root = new IntegerTreeNode(-5);
		
		for (int i = 0; i < 10; i++) {
			root.add(i);
		}
		
		int maxValue = root.getMax();
		
		System.out.println(maxValue);
		
		int minValue = root.getMin();
		
		System.out.println(minValue);
	}
}
