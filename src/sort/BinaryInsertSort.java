package sort;

import static sort.TestArray.array;

import org.junit.Test;

public class BinaryInsertSort {

    /**
     * 二分查找插入排序，寻找插入点不再是顺序遍历比较，而是改成二分查找的形式 时间复杂度：最好-O(n) 最坏-O(n²)
     */
    @Test
    public void sort() {
        System.out.println("The original array is :");
        TestArray.print();
        System.out.println("begin sorting..");
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int index = binarySearchIndex(0, i - 1, array, temp);
            for (int j = i; j > index; j--) {
                array[j] = array[j - 1];
            }
            array[index] = temp;
            TestArray.print();
        }

    }

    /**
     * 二分查找插入点
     */
    private int binarySearchIndex(int low, int high, int[] array, int v) {
        int m;
        int index = 0;
        while (low <= high) {
            m = (low + high) / 2;
            if (v <= array[m]) {
                high = m - 1;
                index = high + 1;
            } else if (v > array[m]) {
                low = m + 1;
                index = low;
            }
        }
        return index;
    }


}
