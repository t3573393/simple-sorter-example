package org.fartpig.sorter;

public class SelectionSorter extends AbstractSorter {

	@Override
	public void sort(int[] data) {
		int length = data.length;
		
		for (int i=(length - 1); i >=0; i --) {
			int max = data[i];
			int maxIndex = i;
			for (int j=0; j < i; j++) {
				if (data[j] > max) {
					max = data[j];
					maxIndex = j;
				}
			}
			
			if (maxIndex != i) {
				swap(data, maxIndex, i);
			}
		}

	}

}
