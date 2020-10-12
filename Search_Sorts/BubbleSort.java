package DataStructures.Search_Sorts;

public class BubbleSort {
    int[] bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
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

