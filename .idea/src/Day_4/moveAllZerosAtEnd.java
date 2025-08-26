package Day_4;//for move zeros to only do sorting in decresing order that it

public class moveAllZerosAtEnd {
    public static void main(String[] args) {
        int []arr={0,1,2,0,23,0};
        for(int i=0;i<arr.length-1;i++){
            for (int j = 0; j <arr.length-1; j++) {
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        for(int result:arr){
            System.out.print(result+" ");
        }
    }
}
