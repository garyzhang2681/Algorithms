package Sort;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2,9,1,4,4,5,5,6,7,2,3,
		int[] array = {2,9,1,4,4,5,5,6,7,2,3};
		//int[] array = {7,6,9};
		
		ArrayList<Integer> x = new ArrayList<>();
		
		
		Collections.sort(x);
		
		//Sort s = new QuictSort();
		Sort s = new SelectionSort();
		s.sort(array);
		
		
		
		
		
	}

}
