public class Launcher {
	public static void main(String[] args) {
		Launcher launcher = new Launcher();
		launcher.launch();
	}
	public void launch() {
		TreeIntSet root = new TreeIntSet(6);
		
		root.add(9);
		
		root.add(5);
		
		root.add(5);
		
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
