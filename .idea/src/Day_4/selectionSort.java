package Day_4;

public class selectionSort {
    public static void main(String[] args) {
        int []arr={10,2,0,32,12};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int result:arr){
            System.out.print(result+" ");
        }
    }
}
