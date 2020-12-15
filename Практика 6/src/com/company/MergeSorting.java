package com.company;

public class MergeSorting {
    public static Comparable[] mergeSorting (Comparable[] list) {
        if (list.length <= 1) return list;

        Comparable[] listA = new Comparable[list.length / 2];
        System.arraycopy(list, 0, listA, 0, list.length / 2);

        Comparable[] listB = new Comparable[list.length - list.length / 2];
        System.arraycopy(list, list.length / 2, listB, 0, list.length - list.length / 2);

        listA = mergeSorting(listA);
        listB = mergeSorting(listB);

        System.arraycopy(mergeList(listA, listB), 0, list, 0, list.length);
        return mergeList(listA, listB);
    }

    public static Comparable[] mergeSorting(Comparable[] list1, Comparable[] list2, Comparable[] result) {
        System.arraycopy(mergeSorting(mergeList(list1, list2)), 0, result, 0, result.length);
        return mergeSorting(mergeList(list1, list2));
    }

    static Comparable[] mergeList(Comparable[] list1, Comparable[] list2) {
        Comparable[] list = new Comparable[list1.length + list2.length];
        int posA = 0;
        int posB = 0;

        for (int i = 0; i < list.length; i++) {
            if (posA == list1.length) {
                list[i] = list2[posB];
                posB++;
            } else if (posB == list2.length) {
                list[i] = list1[posA];
                posA++;
            } else if (list1[posA].compareTo(list2[posB]) < 0) {
                list[i] = list1[posA];
                posA++;
            } else {
                list[i] = list2[posB];
                posB++;
            }
        }

        return list;
    }
}