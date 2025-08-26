package Day_4;
import java.util.ArrayList;

public class mergeTwoSortedArrays {
    public static void main(String[] args) {
        int []arr={1,3,5,6,8,9};
        int []brr={0,2,3,4,10};
        ArrayList<Integer> name=new ArrayList<>();
        int i=0,j=0;
        while(i<arr.length && j<brr.length){
            if(arr[i]<=brr[j]){
                name.add(arr[i]);
                i++;
            }
            else {
                name.add(brr[j]);
               j++;
            }
        }
        while(i<arr.length){
            name.add(arr[i]);
            i++;
        }
        while(j<brr.length){
            name.add(brr[j]);
            j++;
        }
        System.out.println(name);

    }
}
