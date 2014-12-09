package Sort;

import java.util.ArrayList;

public class QuictSort implements Sort {

	public void quickSort(int[] array, int startIndex, int endIndex) {

		CommonFunctionality.printPartArray(array, startIndex, endIndex);
		if (startIndex == endIndex) {
			return;
		}
		int s = startIndex;
		int e = endIndex;

		int middleNumber = array[(startIndex + endIndex) / 2];

		while (s < e) {
			while (array[s] <= middleNumber) {
				s++;
			}
			while (array[e] > middleNumber) {
				e--;
			}
			if (s < e) {
				array[s] = array[s] + array[e];
				array[e] = array[s] - array[e];
				array[s] = array[s] - array[e];

			}

		}
		quickSort(array, startIndex, s);
		quickSort(array, s + 1, endIndex);
	}

	@Override
	public void sort(int[] unsortedArray) {
		quickSort(unsortedArray, 0, unsortedArray.length - 1);
	}

}
