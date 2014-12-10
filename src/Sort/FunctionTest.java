package Sort;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2,9,1,4,5,6,7,2,3,
		int[] array = {4,3,4,5,4};
		//int[] array = {7,6,9};
		Sort s = new QuictSort();
		s.sort(array);
		
		CommonFunctionality.printArray(array);
		CommonFunctionality.swap(array[0], array[1]);
		CommonFunctionality.printArray(array);
		
		
		
	}

}
