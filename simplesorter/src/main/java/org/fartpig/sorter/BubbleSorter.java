package org.fartpig.sorter;

public class BubbleSorter extends AbstractSorter{

	@Override
	public void sort(int[] data) {
		int length = data.length;
		for (int i=0; i< length; i++) {
			for (int j=i+1; j< length; j++) {
				if (data[i] > data[j]) {
					swap(data, i, j);
				}
			}
		}		
	}

}
