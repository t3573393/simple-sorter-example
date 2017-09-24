package org.fartpig;

import java.util.Arrays;

import org.fartpig.sorter.BubbleSorter;
import org.fartpig.sorter.CountSorter;
import org.fartpig.sorter.HeapSorter;
import org.fartpig.sorter.InsertionSorter;
import org.fartpig.sorter.MergeSorter;
import org.fartpig.sorter.QuickSorter;
import org.fartpig.sorter.SelectionSorter;
import org.fartpig.sorter.ShellSorter;
import org.fartpig.sorter.Sorter;

public class App {

	public static void main(String[] args) {

		int[] data = { 5, 8, 9, 3, 4, 8, 3, 4, 11, 56, 15 };
		System.out.println("original:");
		outputArray(data);

		int[] tempData = Arrays.copyOf(data, data.length);
		Sorter bubleSorter = new BubbleSorter();
		bubleSorter.sort(tempData);
		System.out.println("buble:");
		outputArray(tempData);

		tempData = Arrays.copyOf(data, data.length);
		Sorter insertionSorter = new InsertionSorter();
		insertionSorter.sort(tempData);
		System.out.println("insertion:");
		outputArray(tempData);
		
		tempData = Arrays.copyOf(data, data.length);
		Sorter mergeSorter = new MergeSorter();
		mergeSorter.sort(tempData);
		System.out.println("merge:");
		outputArray(tempData);
		
		tempData = Arrays.copyOf(data, data.length);
		Sorter heapSorter = new HeapSorter();
		heapSorter.sort(tempData);
		System.out.println("heap:");
		outputArray(tempData);
		
		tempData = Arrays.copyOf(data, data.length);
		Sorter selectionSorter = new SelectionSorter();
		selectionSorter.sort(tempData);
		System.out.println("selection:");
		outputArray(tempData);
		
		tempData = Arrays.copyOf(data, data.length);
		Sorter quickSorter = new QuickSorter();
		quickSorter.sort(tempData);
		System.out.println("quick:");
		outputArray(tempData);
		
		tempData = Arrays.copyOf(data, data.length);
		Sorter countSorter = new CountSorter();
		countSorter.sort(tempData);
		System.out.println("count:");
		outputArray(tempData);
		
		tempData = Arrays.copyOf(data, data.length);
		Sorter shellSorter = new ShellSorter();
		shellSorter.sort(tempData);
		System.out.println("shell:");
		outputArray(tempData);


	}

	public static void outputArray(int[] data) {
		System.out.print("[");
		boolean isFirst = true;
		for (int a : data) {
			if (!isFirst) {
				System.out.print(",");
			}
			System.out.print(a);
			if (isFirst) {
				isFirst = false;
			}
		}
		System.out.println("]");
	}

}
