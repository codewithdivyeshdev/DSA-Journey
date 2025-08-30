package Day_7;
import java.util.*;
public class CommonEleInThreeSortedArray {
    public static void main(String[] args) {
        int []a={1,2,3};
        int []b={2,4,6};
        int []c={2,8,12};
        int i=0,j=0,k=0;
        List<Integer> list=new ArrayList<>();
        while(i<a.length && j<b.length && k<c.length){
            if(a[i]==b[j] &&b[j]==c[k] &&a[i]==c[k]){
                list.add(a[i]);
                i++;
                j++;
                k++;
            }
            else if(a[i]>b[j]){
                j++;
            } else if (a[i]>c[k]) {
                k++;
            }
            else i++;
        }
        System.out.println(list);
    }
}
