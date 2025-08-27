package Day_6;

public class searchInDescendingOrder {
    public static void main(String[] args) {
        int []arr={900,434,321,210,115,96,53,21,1,0};
        int i=0,j=arr.length-1,target=434;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]>target) i=mid+1;
            else if(arr[mid]<target) j=mid-1;
            else {
                System.out.println(mid);
                break;
            }
        }
    }
}
