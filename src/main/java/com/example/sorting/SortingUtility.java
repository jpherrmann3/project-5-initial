package com.example.sorting;

public class SortingUtility {


    public static <T extends Comparable<T>> void gnomeSort(T[] data) {

        int index = 0;
        long start = System.nanoTime();
        while (index < data.length){
            if (index == 0 || data[index].compareTo(data[index - 1]) > 0){
                index++;
            }
            else {
                int tempIndex = index;
                while(tempIndex != 0){
                    if (data[tempIndex].compareTo(data[tempIndex - 1]) < 0){
                        swap(data, tempIndex, tempIndex - 1);
                        tempIndex--;
                    }
                    else break;
                }
            }
        }
        long finish = System.nanoTime();
        System.out.println("Gnome Sort Duration: " + (finish - start));
    }


    public static <T extends Comparable<T>> void cocktailShakerSort(T[] data) {

        boolean swapped = true;
        int startIndex = 0;
        int endIndex = data.length;

        // for timer
        long start = System.nanoTime();

        while (swapped == true) {
            swapped = false;
            for (int i = startIndex; i < endIndex - 1; ++i) {
                if (data[i].compareTo(data[i + 1]) > 0) {
                    swap(data, i, i + 1);
                    swapped = true;
                }
            }

            if (swapped == false) {
                break;
            }

            swapped = false;

            endIndex--;

            for (int i = endIndex - 1; i >= startIndex; i--) {
                if (data[i].compareTo(data[i + 1]) > 0) {
                    swap(data, i, i + 1);
                    swapped = true;
                }
            }

            startIndex++;
        }
        long finish = System.nanoTime();
        System.out.println("Cocktail Shaker Sort Duration: " + (finish - start));
    }


    public static <T extends Comparable<T>> void shellSort(T[] data) {

        int n = data.length;
        long start = System.nanoTime();
        // create the gap by length (n) / 2
        // Easier than defining gaps to start at
        for (int gap = n / 2; gap > 0; gap /=2) {

            // Do a gapped insertion sort for every elements in gaps
            // Each loop leaves a[0..gap-1] in gapped order
            for (int index = gap; index < n; index++) {
                T value = data[index];
                int indexTemp = index; // need temporary variable to use for index pointer.
                while (indexTemp >= gap && data[indexTemp - gap].compareTo(value) > 0) {
                    swap(data, indexTemp - gap, indexTemp);
                    indexTemp -= gap;
                }
            }
        }
        long finish = System.nanoTime();
        System.out.println("Shell Sort Duration: " + (finish - start));
    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}





