package org.fartpig.sorter;

public class MergeSorter extends AbstractSorter {

	@Override
	public void sort(int[] data) {
		int length = data.length;
		int[] tempArray = new int[length];
		merge(data, tempArray, 0, length - 1);
	}

	public void merge(int[] original, int[] tempBuff, int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;
			merge(original, tempBuff, start, mid);
			merge(original, tempBuff, mid + 1, end);

			merge(original, tempBuff, start, mid + 1, end);
		}

	}

	private void merge(int[] original, int[] tempBuff, int start, int mid, int end) {
		int i = start;
		int j = mid;
		int tempIndex = start;

		while (i < mid && j <= end) {
			if (original[i] <= original[j]) {
				tempBuff[tempIndex] = original[i];
				tempIndex++;
				i++;
			} else {
				tempBuff[tempIndex] = original[j];
				tempIndex++;
				j++;
			}
		}

		while (i < mid) {
			tempBuff[tempIndex] = original[i];
			tempIndex++;
			i++;
		}

		while (j <= end) {
			tempBuff[tempIndex] = original[j];
			tempIndex++;
			j++;
		}

		copy(tempBuff, original, start, end);

	}

}
