package Day_5;

public class twoSum {
    public static void main(String[] args) {
        int []arr={1,4,2,5,94,0,34,3};
        int target=7;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j =i+1; j <arr.length ; j++) {
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+","+arr[j]);
                    break;
                }
            }

        }
    }
}
