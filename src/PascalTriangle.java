import java.math.BigInteger;

public class PascalTriangle {

	public static void main(String[] args) {
		int n = 100;
		BigInteger[][] triangle = new BigInteger[n][n];
		triangle[0][0] = BigInteger.ONE;
		triangle[1][0] = BigInteger.ONE;
		triangle[1][1] = BigInteger.ONE;
		for (int i = 1; i < n; i++) {
			triangle[0][i] = BigInteger.ZERO;
		}
		for (int i = 2; i < n; i++) {
			triangle[1][i] = BigInteger.ZERO;
		}
		for (int i = 2; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((j == 0) || (i == j)) {
					triangle[i][j] = BigInteger.ONE;
				} else {
					if (j <= i) {
						triangle[i][j] = triangle[i - 1][j - 1].add(triangle[i - 1][j]);
				}
					else {
						triangle[i][j] = BigInteger.ZERO;
					}
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(triangle[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
