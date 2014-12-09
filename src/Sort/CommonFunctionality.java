package Sort;

public class CommonFunctionality {
	public static void swap(Integer a, Integer b) {
		a = a + b;
		b = a - b;
		a = a - b;
	}
	
	public static void printArray(int[] array)
	{
		printPartArray(array, 0 , array.length);
	}
	
	public static void printPartArray(int[] array, int startIndex, int endIndex){
		for(int i = startIndex ; i <= endIndex; i++){
			System.out.print(array[i] + ",");
		}
		System.out.println();
	}
}
