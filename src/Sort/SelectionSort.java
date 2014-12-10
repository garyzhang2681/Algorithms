package Sort;

public class SelectionSort implements Sort {

	private void SelectionSort(int[] unsortedArray) {
		for (int i = 0; i < unsortedArray.length; i++) {
			for (int j = i; j < unsortedArray.length; j++) {
				if (unsortedArray[j] < unsortedArray[i]) {
					unsortedArray[j] = unsortedArray[i] + unsortedArray[j];
					unsortedArray[i] = unsortedArray[j] - unsortedArray[i];
					unsortedArray[j] = unsortedArray[j] - unsortedArray[i];
				}
				CommonFunctionality.printArray(unsortedArray);
			}
		}
	}

	@Override
	public void sort(int[] unsortedArray) {
		// TODO Auto-generated method stub
		this.SelectionSort(unsortedArray);
	}

}
