package org.fartpig.sorter;

public class HeapSorter extends AbstractSorter {

	@Override
	public void sort(int[] data) {
		makeHeap(data);
		int length = data.length;
		for (int i=(length-1) ; i > 0; i --) {
			swap(data, 0, i);
			headAdjust(data, 0, i-1);
		}
	}
	
	public void makeHeap(int[] data) {
		int length = data.length;
		int startIndex = getParentIndex(length - 1);
		for (int i=startIndex; i >= 0 ; i --) {
			headAdjust(data, i, length -1);
		}
	}
	
	public void headAdjust(int[] data, int index, int max) {
		int leftChildIndex = getLeftChildIndex(index);
		int rightChildIndex = getRightChildIndex(index);
		
		if (leftChildIndex > max) {
			return ;
		}
		
		if (rightChildIndex > max) {
			if (data[leftChildIndex] > data[index]) {
				swap(data, leftChildIndex, index);
				headAdjust(data, leftChildIndex, max);
			}
		} else {
			if (data[leftChildIndex] > data[index] || data[rightChildIndex] > data[index]) {
				if (data[leftChildIndex] >= data[rightChildIndex]) {
					swap(data, leftChildIndex, index);
					headAdjust(data, leftChildIndex, max);
				} else {
					swap(data, rightChildIndex, index);
					headAdjust(data, rightChildIndex, max);
				}
			}
		}
	}
	
	private int getParentIndex(int childIndex) {
		return (childIndex - 1)>>1;
	}
	
	private int getLeftChildIndex(int parentIndex) {
		return (parentIndex<<1) + 1;
	}
	
	private int getRightChildIndex(int parentIndex) {
		return (parentIndex<<1) + 2;
	} 

}
