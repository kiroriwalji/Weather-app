import java.util.*;
class Dog {
    public static int[] sortArrays(int[] arr)
    {
         
        int length = arr.length;
        for (int j = 0; j < length - 1; j++) 
        {
            if (arr[j] > arr[j + 1]) 
            {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j = -1;
            }
        }
 
        return arr;
    }
    public static void main(String args[])
    { 
        int arr[] = { 1, 2,9,8,7,6,8, 0, 5, 4,9, 3 };
        System.out.println("Original array: "+ Arrays.toString(arr));    
        arr = sortArrays(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}