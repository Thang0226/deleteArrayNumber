import java.util.Scanner;

public class ArrayNumber {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 10, 34, 35, 22, 10, 9};
		int N = array.length;
		int index = 0, arr[] = {1,2,3};

		System.out.println("Elements in array:");
		for (int num : array) {
			System.out.print(num + " ");
		}
		Scanner input = new Scanner(System.in);
		System.out.println("\nEnter a number to delete: ");
		int number = input.nextInt();

		int ind;
		do {
			ind = findValPosition(number, array);
			if (ind >= 0) {
				deleteValAtIndex(ind, array);
			}
		} while (ind >= 0);

		System.out.println("Elements in array after delete " + number + ":");
		for (int num : array) {
			if (num == 0) break;
			System.out.print(num + " ");
		}
	}

	private static int findValPosition(int number, int[] array) {
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (number == array[i]) {
				index = i;
				break;
			}
		}
		return index;
	}

	private static void deleteValAtIndex(int index, int[] array) {
		for (int i = index; i < array.length; i++) {
			if (i == array.length - 1) {
				array[i] = 0;
			} else {
				array[i] = array[i + 1];
			}
		}
	}
}
