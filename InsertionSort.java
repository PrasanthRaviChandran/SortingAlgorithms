import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arrayToBeSorted[] = { 2, 9, 5, 6, 7 };

		int n = arrayToBeSorted.length;

		insertionSort(arrayToBeSorted, n);

	}

	private static void insertionSort(int[] arrayToBeSorted, int n) {
		for (int i = 0; i < n; i++) {
			int temp = arrayToBeSorted[i];
			int j = i;

			while (j > 0 && temp < arrayToBeSorted[j - 1]) {
				arrayToBeSorted[j] = arrayToBeSorted[j-1];
				j=j-1;
				arrayToBeSorted[j] = temp;
			}
		}
		System.out.println("sorted array" + Arrays.toString(arrayToBeSorted));
	}

}
