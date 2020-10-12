package DataStructures.Search_Sorts;

public class Main {
    public static void main(String[] args){
        int [] arr ={1,2,3,4,5,45,23,54,32,654,123};
        int ele = 3;
     LinearSearch l =new LinearSearch();
     int result =   l.search(arr,ele);
    if(result == -1){
      System.out.println("Given element "+ ele +  " not found");
      }
    else {
      System.out.println("Element " + ele +" found at index "+result);
     }
    }
}
