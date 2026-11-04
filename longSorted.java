public static int longestSorted(int[] a) {
    if (a.length == 0) {
        return 0;
    }
    
    int maxLen = 1;
    int currentLen = 1;
    
    for (int i = 0; i < a.length - 1; i++) {
        if (a[i] <= a[i + 1]) {
            currentLen++;
            if (currentLen > maxLen) {
                maxLen = currentLen;
            }
        } else {
            currentLen = 1;
        }
    }
    
    return maxLen;
}