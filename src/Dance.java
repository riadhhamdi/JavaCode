import java.util.Arrays;

public class Dance {
	static int n = 100000;
	static int[] moves = new int[n + 1];

	public static int getMoves(int n) {
		if (moves[n] != Integer.MIN_VALUE)
			return moves[n];
		moves[n] = getMoves(n - 1) - getMoves(n - 2);
		return moves[n];
	}
	public static void main(String[] args) {
		int pos = 0;
		Arrays.fill(moves, Integer.MIN_VALUE);
		moves[0] = 0;
		moves[1] = 1;
		moves[2] = -2;
		for (int i = 0; i < n + 1; i++) {
			moves[i] = getMoves(i);
			pos += moves[i];
		}
		System.out.println(pos);
	}

}
