package Day_6;

public class binarySearch {
    public static void main(String[] args) {
        int []arr={-76,-4,9,28,47,49,510,615,9911,99999};
        int target=615;
        int i=0,j=arr.length-1;
        boolean flag=false;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]>target){
                j=mid-1;
            } else if (arr[mid]<target) {
                i=mid+1;
            }

            else {
                System.out.println("there is element at index:"+mid);
               flag=true;
               break;
            }
        }
        if(!flag){
            System.out.println("no element in array");
        }
    }
}
