package Sort;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {4,5,1,2,3};
		
		Sort s = new QuictSort();
		s.sort(array);
		
		CommonFunctionality.printArray(array);
		CommonFunctionality.swap(array[0], array[1]);
		CommonFunctionality.printArray(array);
		
		
		
	}

}
