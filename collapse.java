public static int[] collapse(int[] a) {
    int newLen = (a.length + 1) / 2;
    int[] result = new int[newLen];
    
    for (int i = 0; i < a.length / 2; i++) {
        result[i] = a[2 * i] + a[2 * i + 1];
    }
    
    if (a.length % 2 != 0) {
        result[result.length - 1] = a[a.length - 1];
    }
    
    return result;
}