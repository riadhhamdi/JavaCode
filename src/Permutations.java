
public class Permutations {

	public static void displayArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void permute(int[] arr, int start) {
		int size = arr.length - 1;
		if (start == size)
			displayArray(arr);
		else {
			for (int i = start; i <= size; i++) {
				int tmp = arr[start];
				arr[start] = arr[i];
				arr[i] = tmp;
				permute(arr, start + 1);
				tmp = arr[start];
				arr[start] = arr[i];
				arr[i] = tmp;

			}

		}
	}

	public static void main(String[] args) {
		int tab[] = { 1, 2, 3 };
		permute(tab, 0);
	}
}
