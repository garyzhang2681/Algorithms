package Sort;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2,9,1,4,4,5,5,6,7,2,3,
		int[] array = {2,6,3,8,45,3,7,5};
		//int[] array = {7,6,9};
		
	
		
		//Sort s = new QuickSort();
		//Sort s = new SelectionSort();
		Sort s = new InsertionSort();
		s.sort(array);
		
		
		
		
		
	}

}
