package DataStructures.Search_Sorts;

public class Driver {
    public static void main(String[] args) {
       // SelectionSort ss =new SelectionSort();
        BubbleSort b =new BubbleSort();
        int[] arr ={2,3,4,1,5};
        int[] sortedArray = b.bubbleSort(arr);

        for(int i =0 ;i < sortedArray.length;i++){
            System.out.println(sortedArray[i]);
        }
    }
}
