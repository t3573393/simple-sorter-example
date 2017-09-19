package org.fartpig.sorter;

public class InsertionSorter extends AbstractSorter {

	@Override
	public void sort(int[] data) {
		int length = data.length;
		int temp = -1;
		for (int i = 0; i < (length - 1); i++) {
			temp = data[i+1];
			for (int z = i; z >= 0; z--) {
				if (data[z] >= temp) {
					swap(data,z + 1,z);
				} else {
					break;
				}
			}
		}

	}

}
