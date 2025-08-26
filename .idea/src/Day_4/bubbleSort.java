package Day_4;

public class bubbleSort {
    public static void main(String[] args) {
        int []arr={10,15,2,4,0};
        for (int j = 0; j <arr.length-1 ; j++) {
            for(int i=0;i<arr.length-1-j;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
        }
        }
        for(int nums:arr){
            System.out.println(nums+" ");
        }
        System.out.println("Sorting complete!");
    }
}
