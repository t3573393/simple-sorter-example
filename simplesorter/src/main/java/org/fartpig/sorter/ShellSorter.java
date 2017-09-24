package org.fartpig.sorter;

public class ShellSorter extends AbstractSorter {

	@Override
	public void sort(int[] data) {
		int length = data.length;
		int step = length;
		
		while(true) {
			step = step / 2;
			if (step < 0 ) {
				step = 1;
			}
			shellSort(data, step,length);
			if (step == 1) {
				break;
			}
		}
	}
	
	private void shellSort(int[] data, int step, int length) {
		for (int i=0; i < step; i ++) {
			for (int j=i; j < length; j+= step) {	
				int min = data[j];
				int minIndex = j;
				for (int k=(j+step); k < length; k+= step) {				
					if (min > data[k]) {
						min = data[k];
						minIndex = k;
					}
				}
				swap(data, j, minIndex);
			}
			
		}
	}

}
