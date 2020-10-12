package DataStructures.Search_Sorts;

public class LinearSearch {
    public int search(int[] arr, int ele) {
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                flag = true;
                if (flag == true) {
                    return i;
                }
            }
        }
        return -1;
    }
}


