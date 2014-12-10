package Sort;

import java.util.ArrayList;

public class QuictSort implements Sort {

	// public static void QuickSort1(int[] a, int lo0, int hi0) {
	// int lo = lo0;
	// int hi = hi0;
	//
	// if (lo >= hi)
	// return;
	//
	// // ȷ��ָ�뷽����߼�����
	// boolean transfer = true;
	//
	// while (lo != hi) {
	// if (a[lo] > a[hi]) {
	// // ��������
	// int temp = a[lo];
	// a[lo] = a[hi];
	// a[hi] = temp;
	// // �����±��ƶ��������ϱ��ƶ�
	// transfer = (transfer == true) ? false : true;
	// }
	//
	// // ��ָ����ǰ��������ƶ�
	// if (transfer)
	// hi--;
	// else
	// lo++;
	//
	// // ��ʾÿһ��ָ���ƶ����������ֵı仯
	//
	// for(int i = 0; i < a.length; ++i) { System.out.print(a[i] + ",");
	// } System.out.print(" (lo,hi) = " + "(" + lo + "," + hi + ")");
	// System.out.println("");
	//
	// }
	//
	// // ������ֿ����룬ȷ��ÿ�����ֵ���ȷλ��
	// lo--;
	// hi++;
	// QuickSort(a, lo0, lo);
	// QuickSort(a, hi, hi0);
	// }

	public void quickSort(int[] array, int startIndex, int endIndex) {

		CommonFunctionality.printPartArray(array, startIndex, endIndex);
		if (startIndex >= endIndex) {
			return;
		}
		int i = startIndex;
		int j = endIndex;

		int middleNumber = array[(startIndex + endIndex) / 2];

		array[(startIndex + endIndex) / 2] = array[endIndex];
		while (i < j) {

			while (array[i] < middleNumber && i < j) {
				i++;
			}
			array[j] = array[i];

			
			while (array[j] >= middleNumber && i < j) {
				j--;
			}
			array[i] = array[j];

			

			CommonFunctionality.printArray(array);

		}
		array[i] = middleNumber;
		quickSort(array, startIndex, i);
		quickSort(array, i + 1, endIndex);
	}

	@Override
	public void sort(int[] unsortedArray) {
		quickSort(unsortedArray, 0, unsortedArray.length - 1);
	}

}
