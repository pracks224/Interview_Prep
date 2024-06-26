package DSA.src.String_practise;

public class RotationArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int arrSize = 4;
        int k = 2;
        for (int i = 0; i < arrSize; i++) {
            if (i < k)
                System.out.print(arr[arrSize + i - k]);
            else
                System.out.print(arr[i - k]);
            System.out.print(" ");

        }
    }
}

