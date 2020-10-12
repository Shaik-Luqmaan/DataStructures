package DataStructures.Search_Sorts;

class BinarySearch {
    int binarySearch(int arr[], int ele) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == ele) {
                return mid;
            }
            if (arr[mid] < ele) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

}

class Test{
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int ele = 10;
        int result = ob.binarySearch(arr, ele);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}