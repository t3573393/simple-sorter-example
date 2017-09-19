package org.fartpig.sorter;

public abstract class AbstractSorter implements Sorter {

	protected void swap(int[] data, int i, int j) {
		if ( i == j) {
			return ;
		}
		
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	
	protected void copy(int[] src, int[] target, int start, int end) {
		for (int i=start; i<=end; i++) {
			target[i] = src[i];
		}
	}
}
