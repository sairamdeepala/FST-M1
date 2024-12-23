import java.util.Arrays;

public class Activity4 {

	static void ascendingSort(int array[]) {
		int size = array.length, i;

		for (i = 1; i < size; i++) {
			int key = array[i];
			int j = i - 1;

			while (j >= 0 && key < array[j]) {
				array[j + 1] = array[j];
				--j;
			}
			array[j + 1] = key;
		}
	}

	public static void main(String[] args) {

		int[] array = { 1, 7, 4, 8, 9, 17, 10, 20, 34, 75, 100, 99, 16, 10 };
		ascendingSort(array);
		System.out.println("Original Array : ");
		System.out.println((Arrays.toString(array)));

	}

}
