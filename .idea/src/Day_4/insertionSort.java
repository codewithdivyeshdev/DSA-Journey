package Day_4;

public class insertionSort {
    public static void main(String[] args) {
        int []arr={10,2,0,32,12};
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        for(int result:arr){
            System.out.print(result+" ");
        }
    }
}
