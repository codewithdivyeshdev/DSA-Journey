package Day_3;

public class largestElementInArray {
    public static void main(String[] args) {
        int[] arr = {12, 2, 23, 43, 2};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println(max);
    }
}
