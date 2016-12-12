public class Launcher {
	public static void main(String[] args) {
		Launcher launcher = new Launcher();
		launcher.launch();
	}
	public void launch() {
		TreeIntSet root = new TreeIntSet(6);
		
		root.add(9);
		
		root.add(5);
		
		root.add(3);
		
		root.add(8);

		root.add(11);
		
		root.add(12);
		
		String tree = root.toString();
		
		System.out.println(tree);
		
		int value = 5;
		
		if (root.containsVerbose(value)) {
			System.out.println("This tree contains " + value + ".");
		} else {
			System.out.println("This tree does not contain " + value + ".");
		}
	}
}
