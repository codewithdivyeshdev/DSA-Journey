package Day_7;//leetcode 35
//exmaple on sorted array operation
public class searchInsertPosition {
    public static void main(String[] args) {
        int []arr={1,2,4,6,8,9,10};
        int i=0,j=arr.length,index=-1,target=3;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==target){
                System.out.println(mid);
            }
            else if(arr[mid]<target){
                i=mid+1;
            }//hello

            else j=mid-1;
        }
        System.out.println(i);
    }
}
