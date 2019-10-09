
public class Echo {
	public static void main(String... args) {
		String out = String.join("\n", args);
		// out = out.replaceAll(" ", "\n");
		System.out.println(out);
	}

}
