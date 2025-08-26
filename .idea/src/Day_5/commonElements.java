package Day_5;//here given two arrays we will return a list that coantain
//common elements into that two arrays and in that list may be there duplicates
import java.util.ArrayList;

public class commonElements {
    public static void main(String[] args) {
        int []a={1,3,2,2,5,87,34,23,0};
        int []b={1,54,34,2,43,0,2};
        ArrayList<Integer> name=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    name.add(a[i]);
                    break;
                }
            }
        }
        System.out.println(name);
    }
}
