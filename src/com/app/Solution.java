package com.app;

public class Solution {

    public boolean isMaxHeap(int[] a, int index) {
        if (index >= a.length) {
            return true;
        }
        int leftIndex = 2 * index + 1;
        if (leftIndex >= a.length) {
            return true;
        }
        int rightIndex = 2 * index + 2;
        if (rightIndex >= a.length) {
            return a[index] >= a[leftIndex] && isMaxHeap(a, leftIndex);
        } else {
            return (a[index] >= a[leftIndex] && a[index] >= a[rightIndex]) && isMaxHeap(a, leftIndex) && isMaxHeap(a, rightIndex);
        }
    }
}
