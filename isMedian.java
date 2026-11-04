public static boolean isMedian(int[] a, int median) {
    int smaller = 0;
    int larger = 0;
    
    for (int num : a) {
        if (num < median) {
            smaller++;
        } else if (num > median) {
            larger++;
        }
    }
    
    return smaller == larger;
}