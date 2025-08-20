package Day_4;

public class checkArrayisSorted {
    public static void main(String[] args) {
        int []arr={0,1,2,5,4};
        boolean flag=issorted(arr);
        System.out.println(flag);

    }
    public static boolean issorted(int []arr){
        boolean flag1=false;
        for (int i = 0; i <arr.length-1 ; i++) {
         if(arr[i]>arr[i+1]) return flag1;
        }

     return true;}
}
