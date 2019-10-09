import java.util.Stack;

public class Braces {

	static boolean check(String s) {
		if (s == null)
			return true;
		if (s.equals(""))
			return true;
		Stack<Character> st = new Stack<Character>();
		Character head;
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if (c == '(' || c == '[')
				st.push(c);
			else {
				if (st.isEmpty())
				{
					// System.out.println("empty Stack :");
					return false;
				}
				head = st.pop();
				if ((c == ']' && head != '[') || (c == ')' && head != '('))
				{
					// System.out.println("non closed brace");
					return false;
				}
			}
		}
		if (st.isEmpty())
			return true;
		else
		{
			// System.out.println("non empty stack at the end:");
			return false;
		}

	}

	public static void main(String[] args) {// driver main method

		System.out.println(check(null));// true
		System.out.println(check(""));// true
		System.out.println(check("[()]"));// true
		System.out.println(check("(()[])"));// true
		System.out.println(check("([)]"));// flase
		System.out.println(check("(("));// flase
		System.out.println(check("[(()])"));// flase
		System.out.println(check("["));// flase
	}

}
