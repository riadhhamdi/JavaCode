
public class ClosestToZero {

	static int closestToZero(int[] ints) {
		int minDiff = Integer.MAX_VALUE;
		boolean pos = false;
		for (int i = 0; i < ints.length; i++) {
			if (Math.abs(ints[i]) < minDiff) {
				minDiff = Math.abs(ints[i]);
				if (ints[i] >= 0) {
					pos = true;
				} else {
					pos = false;
				}
			} else if (Math.abs(ints[i]) == minDiff) {
				if (ints[i] >= 0) {
					pos = true;
				}
			}
		}
		return pos ? minDiff : -minDiff;
	}
}
