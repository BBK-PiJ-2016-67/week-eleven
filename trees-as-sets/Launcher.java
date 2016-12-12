public class Launcher {
	public static void main(String[] args) {
		Launcher launcher = new Launcher();
		launcher.launch();
	}
	public void launch() {
		ListIntSet root = new ListIntSet();
		
		root.add(9);
		
		root.add(5);
		
		root.add(5);
		
		root.add(7);
		
		root.add(2);
		
		root.add(12);
		
		root.add(13);
		
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
