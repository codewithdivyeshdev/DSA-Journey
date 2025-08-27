package Day_6;

public class lastOccurancee {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 5, 5, 5, 6, 7, 8, 11};
        int i=0,j=arr.length-1,target=5,index=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]>target) j=mid-1;
            else if(arr[mid]<target) i=mid+1;
            else {
                index=mid;
                i=mid+1;

            }
        }
        System.out.println(index);
    }
}
