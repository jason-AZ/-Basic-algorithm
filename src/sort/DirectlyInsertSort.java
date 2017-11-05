package sort;

import static sort.TestArray.array;

import org.junit.Test;

public class DirectlyInsertSort {

    /**
     * 直接插入排序-升序
     *
     * 以第一个数为有序的基数，从第二个数开始为待排序数，将其跟前一个数比较，如果比前一个数小，则将第一个数往后移动，循环最终找到插入点
     * 理解插入的操作就是需要不断位移给出空的位置
     * 时间复杂度：最好-O(n) 最坏-O(n²)
     */
    @Test
    public void sort() {
        int i, j, temp;
        TestArray.print();
        for (i = 1; i < array.length; i++) {
            temp = array[i];
            j = i - 1;
            while (j >= 0 && temp < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;

//            for(j = i - 1; j >=0 ; j--){
//                if(temp < array[j]){
//                    array[j + 1] = array[j];
//                    array[j] = temp;
//                }
//            }
            TestArray.print();
        }
        System.out.println("After sort: ");
        TestArray.print();

    }

}
