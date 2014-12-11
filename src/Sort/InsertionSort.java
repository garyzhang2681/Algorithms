package Sort;

public class InsertionSort implements Sort {

	public void InsertionSort(int[] array) {
		
		for (int i = 1; i < array.length; i++) {
			CommonFunctionality.printArray(array);
			int temp = array[i];
			int j = i;
			
			
			//方法1
			while (j>0 && temp < array[j-1]) {
					array[j] = array[j - 1];
					j--;
			}
			array[j] = temp;
			CommonFunctionality.printArray(array);
			
			//方法2	
//			while (j>0) {
//				if (temp < array[j-1]) {
//					array[j] = array[j - 1];
//					j--;
//				} else{
//					break;
//				}
//			}
//			array[j] = temp;
//			CommonFunctionality.printArray(array);
			
			
			
			//方法3
//			for (int j = i; j > 0; j--) {
//				if (temp < array[j-1]) {
//					array[j] = array[j - 1];
//					if(j == 1){
//						array[0] = temp;
//					}
//				} else {
//					array[j] = temp;
//					break;
//				}
//			}
		}
	}

	@Override
	public void sort(int[] unsortedArray) {
		// TODO Auto-generated method stub
		this.InsertionSort(unsortedArray);
	}

}
