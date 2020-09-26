//CS245 Lab04
//Xiaocheng Zhang

import java.util.*;

public class KLists{
	public static double[][] inputArr ={ { 9.7,17.1}, {15.8}, {12.7,18.5,21.27} };
	public static double[] randomArr;
	// merge input array to a large random array
	public static double[] mergeKLists(double[][] outerArray){
		int nums = 0;
		// set the number of numbers in large array
		for (int i = 0; i < outerArray.length; i++){
			for (int j = 0; j < outerArray[i].length; j++){
				nums++;
			}
		}

		randomArr = new double[nums];
		// fill the large array
		int o = 0;
		for (int x = 0; x < outerArray.length; x++){
			for (int y = 0; y < outerArray[x].length; y++){
				randomArr[o] = outerArray[x][y];
				o++;
			}
		}
		return randomArr;
	}
	//sort the array
	public static double[] sort(double[] Arr, int len) {
		for (int i = 0; i < len - 1; i++) {
			int min = i;
			for (int j = i + 1; j < len; j++) {
				if (Arr[j] < Arr[min]) {
					min = j;
				}
			}
			double temp = Arr[i];
			Arr[i] = Arr[min];
			Arr[min] = temp;
		}
		return Arr;
	}

	// main Function
	public static void main(String[] args){
		System.out.println("Input outerArray: " + Arrays.deepToString(inputArr));
		mergeKLists(inputArr);
		sort(randomArr, randomArr.length);
		System.out.println("Output Array: " + Arrays.toString(randomArr));
	}
}