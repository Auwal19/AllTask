public static double percentEven(int[] a) {
    if (a.length == 0) {
        return 0.0;
    }
    
    int evenCount = 0;
    for (int num : a) {
        if (num % 2 == 0) {
            evenCount++;
        }
    }
    
    return ((double) evenCount / a.length) * 100.0;
}