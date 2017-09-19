package org.fartpig.sorter;

public class CountSorter extends AbstractSorter {

	@Override
	public void sort(int[] data) {
		int max = data[0];
		int length = data.length;
		
		for (int i = 0; i < length; i ++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		
		int[] numbers = new int[max];
		for (int i=0; i < length ; i ++) {
			numbers[data[i] - 1] = numbers[data[i] - 1] + 1;
		}

		for (int i=1; i < max ; i ++) {
			numbers[i] = numbers[i - 1] + numbers[i];
		}
		
		int[] result = new int[length];
		for (int i = length -1 ; i >= 0 ; i--) {
			result[numbers[data[i] - 1] - 1] = data[i];
			numbers[data[i]-1] --;
		}
		
		copy(result, data, 0, length -1);
	}

}
