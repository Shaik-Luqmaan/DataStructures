package DataStructures.Search_Sorts;

public class SelectionSort {
    public int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
                swap(arr, min_idx, i);
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
