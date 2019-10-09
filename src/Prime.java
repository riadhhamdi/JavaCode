import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prime {

	/*
	 * static long[] fibo = new long[100];
	 * 
	 * static long fibbo(int n) { for (int i = 0; i <= n; i++) { if (fibo[i] == 0) {
	 * fibo[i] = fibo[i - 2] + fibo[i - 1]; } } return fibo[n]; }
	 */
	static int sockMerchant(int n, int[] ar) {
		int[] count = new int[101];
		int sum = 0;
		Arrays.fill(count, 0);
		for (int i = 0; i < n; i++) {
			count[ar[i]]++;
		}
		for (int i = 0; i < 101; i++) {
			sum += count[i] / 2;
			// System.out.println( "count "+i+":\t"+count[i]+"\tsum "+sum);
		}
		return sum;
	}

	static int jumpingOnClouds(int[] c) {
		int jumps = 0, i = 0, l = c.length;

		while (i < l) {
			if (i + 2 < l && c[i + 2] == 0) {
				i += 2;
			} else {
					i++;
			}
			if (i < l)
			jumps++;
			System.out.println("i\t : " + i + " jumps\t : " + jumps);
		}
		return jumps;
	}

	List<Integer> createRange(int n) {
		List<Integer> list = new ArrayList<>();// 10
        for (int i = 0; i < n; i++) {
			list.add(i);
        }
        return list;
}

	public static void main(String[] args) {
		BigInteger maxVal = new BigInteger(String.valueOf(Integer.MAX_VALUE));
		maxVal = maxVal.multiply(new BigInteger("2"));
		// System.out.println(maxVal);
		int[] ar = { 44, 55, 11, 15, 4, 72, 26, 91, 80, 14, 43, 78, 70, 75, 36, 83, 78, 91, 17, 17, 54, 65, 60, 21, 58,
				98, 87, 45, 75, 97, 81, 18, 51, 43, 84, 54, 66, 10, 44, 45, 23, 38, 22, 44, 65, 9, 78, 42, 100, 94, 58,
				5, 11, 69, 26, 20, 19, 64, 64, 93, 60, 96, 10, 10, 39, 94, 15, 4, 3, 10, 1, 77, 48, 74, 20, 12, 83, 97,
				5, 82, 43, 15, 86, 5, 35, 63, 24, 53, 27, 87, 45, 38, 34, 7, 48, 24, 100, 14, 80, 54 };
		int[] clouds = { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0 };
		String s ="kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm";
		// long n = 736778906400;
		// System.out.println(sockMerchant(100, ar));
		System.out.println(jumpingOnClouds(clouds));


		/*
		 * Arrays.fill(fibo, 0); fibo[0] = fibo[1] = 1; for (int i = 0; i < 100; i++) {
		 * System.out.println(i + "\t:\t" + fibbo(i)); }
		 */
		// TODO Auto-generated method stub/*
		/*
		 * int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53,
		 * 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137,
		 * 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199 }; long multi
		 * = 1; int count = 0; for (int i = 0; i < primes.length; i++) { multi *=
		 * primes[i]; count++; System.out.println(multi + "\t" + count); }
		 */

	}

}
