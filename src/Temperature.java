import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer n = in.nextInt();
		Boolean neg = null;
		//int[] temperature = { -300 };
		if (n == 0) {
			System.out.println(0);
			return;
		}
		Integer diff = Integer.MAX_VALUE, tmp;
		for (int i = 0; i < n; i++) {
			tmp = in.nextInt();
			if (diff > Math.abs(tmp)) {
				if (tmp < 0) {
					neg = true;
				} else
					neg = false;
			}
			diff = Math.min(diff, Math.abs(tmp));
		}
		System.out.println(neg ? -diff : diff);
	}

}
