package Day_6;

public class seachIndescendingOrderFirstOccurance {
    public static void main(String[] args) {
        int[] arr = {900, 900, 900, 434, 321, 321, 210, 115, 96, 53, 21, 1, 0};
        int i = 0, j = arr.length - 1, target = 321, index = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] < target) j = mid - 1;
            else if (arr[mid] > target) i = mid + 1;
            else {
                index = mid;
                j = mid - 1;
            }
        }
        System.out.println("first index:"+index);

        //for the last occurance
        int low=0,high=arr.length-1,index2=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target) low=mid+1;
            else if(arr[mid]<target) high=mid-1;
            else{
                index2=mid;
                low=mid+1;
            }
        }
        System.out.println("last index:"+index2);

    }
}

