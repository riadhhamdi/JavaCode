
public class OuterClass {
	private String str;

	class InnerClass {

	}

	public static void main(String[] args) {
		OuterClass o = new OuterClass();
		InnerClass o1 = o.new InnerClass();
		;
	}
}
