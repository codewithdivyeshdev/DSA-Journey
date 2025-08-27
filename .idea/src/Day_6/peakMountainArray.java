package Day_6;//find the index where in array's highest element

import java.util.Arrays;

public class peakMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 34,34,23,12,10, 3, 2, 0};

//           for(int j=0;j<arr.length-2;j++){
//               if(arr[j]>arr[j+1]){
//                   System.out.println(j);
//                   break;
//               }
//}
        //find the peak element in mountain array
//        Arrays.sort(arr);
//        System.out.println(arr[arr.length-1]);
        //here time complexity id O(n) and we want to O(log n)
        int i = 0, j = arr.length;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] > arr[mid + 1]&&arr[mid]>arr[mid-1])  {
                System.out.println(mid);
                break;
            }
           else if(arr[mid]<arr[mid+1]){
               i=mid+1;

            }
           else j=mid-1;
        }
    }
}
