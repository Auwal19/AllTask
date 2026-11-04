public static int lastIndex(int[] a, int value) {
    for (int i = a.length - 1; i >= 0; i--) {
        if (a[i] == value) {
            return i;
        }
    }
    return -1;
}