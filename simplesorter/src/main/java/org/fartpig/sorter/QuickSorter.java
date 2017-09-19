package org.fartpig.sorter;

public class QuickSorter extends AbstractSorter {

	@Override
	public void sort(int[] data) {
		int length = data.length;
		sort(data, 0, length-1);
	}
	
	private void sort(int[] data, int start, int end) {
		if (start < end) {
			int mid = quickSort(data, start, end);
			sort(data, start, mid-1);
			sort(data, mid+1, end);
		}
	}
	
	private int quickSort(int[] data, int start, int end) {
		int pivot = data[start];
		int i = start;
		int j = end;
		
		while (i < j) {
			while(j > i) {
				if (data[j] < pivot) {
					break;
				} else {
					j --;
				}
			}
			swap(data, i, j);
			
			while(j > i) {
				if (data[i] >= pivot) {
					break;
				} else {
					i ++;
				}
			}
			swap(data, i, j);
		}
		
		data[i] = pivot;
		return i;
	}

}
