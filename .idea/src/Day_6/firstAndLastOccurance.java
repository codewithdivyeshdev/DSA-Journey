package Day_6;

public class firstAndLastOccurance {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 5, 5, 5, 6, 7, 8, 11};
        int i=0,j=arr.length-1,target=5,lastindex=-1,firstindex=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]>target) j=mid-1;
            else if(arr[mid]<target) i=mid+1;
            else {
                lastindex=mid;
                i=mid+1;

            }
        }
        int low=0,high=arr.length-1;
        while (low<= high) {
            int mid = (low+ high) / 2;
            if (arr[mid] < target) low = mid + 1;
            else if (arr[mid] > target) high = mid - 1;
            else {
                firstindex = mid;
                high = mid - 1;

            }

        }
        System.out.println("first index:"+firstindex+",last index:"+lastindex );

    }
}
