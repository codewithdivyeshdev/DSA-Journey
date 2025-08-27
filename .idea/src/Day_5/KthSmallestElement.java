package Day_5;
import java.util.Arrays;
public class KthSmallestElement {
    public static void main(String[] args) {
        int []a={1,3,5,6,23,34,45};
        int k=2;
       Arrays.sort(a);
        System.out.println(a[k-1]);


    }
}
