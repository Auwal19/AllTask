import java.util.Arrays;

public static int LargestElement(int k, int[] a) {
    Arrays.sort(a);
    return a[a.length - 1 - k];
}