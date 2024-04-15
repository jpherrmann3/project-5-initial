package com.example.sorting;

public class SortingUtility {


    public static <T extends Comparable<T>> void gnomeSort(T[] data) {

        int pos = 0;
        while (pos < data.length){
            if (pos == 0 || data[pos].compareTo(data[pos - 1]) > 0){
                pos++;
            }
            else {
                swap(data, pos, pos - 1);
                pos = pos - 1;
            }
        }
    }


    public static <T extends Comparable<T>> void cocktailShakerSort(T[] data) {

        // TODO implement Cocktail Shaker Sort here
    }


    public static <T extends Comparable<T>> void shellSort(T[] data) {

        // TODO implement Shell Sort here
    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}





