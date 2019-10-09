import java.util.EmptyStackException;

public class StackMemLeak {

	private Object[] elements;
	static private int size = 0;

	public StackMemLeak(int initialCapacity) {
		elements = new Object[initialCapacity];
	}

	public void push(Object object) {
		ensureCapacity();
		elements[size++] = object;
	}

	public Object pop() {
		if (size == 0) {
			throw new EmptyStackException();
		}
		// return elements[--size];

		Object data = elements[--size];
		elements[size] = null;
		return data;

	}

	private void ensureCapacity() {
		if (elements.length == size - 1) {
			Object[] old = elements;
			elements = new Object[2 * size + 1];
			System.arraycopy(old, 0, elements, 0, size);
		}
	}

	public static void showMemUsed() {
		Runtime rt = Runtime.getRuntime();
		long prevTotal = rt.totalMemory();
		long prevFree = rt.freeMemory();
		System.out.println(prevTotal - prevFree);
	}

	public static void main(String[] args) {
		int n = 1000000;
		StackMemLeak stack = new StackMemLeak(n);
		showMemUsed();
		for (int i = 0; i < n; i++) {
			stack.push("azertyuiopmlkjhgfdsqwcvbn,poiuytzdfjhgfzeryupmlkjhwxvbnpoiuytrezaqsdfghjklm,nbvcx" + i);
			System.out.println(stack.pop());
		}

		showMemUsed();

	}

}
