package DataStructures.Search_Sorts;

public class InsertionSort {
    public int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int curr_idx = i;
            while (curr_idx > 0 && arr[curr_idx] < arr[curr_idx - 1]) {
                swap(arr, curr_idx, curr_idx - 1);
                curr_idx = curr_idx - 1;
            }
        }
        return arr;
    }

    void swap(int[] arr, int a, int b) {
        int temp;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b] =temp;
    }
}

class TestingInsertionSort{
    public static void main(String[] args) {
        InsertionSort i =new InsertionSort();
        int[] arr = {1,4,5,6,2,3,8,0,9};
        int[] sortedArray = i.insertionSort(arr);
        for(int j=0;j<sortedArray.length;j++){
            System.out.println(sortedArray[j]);
        }
    }
}