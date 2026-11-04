public static double stdev(int[] a) {
    double sum = 0;
    for (int num : a) {
        sum += num;
    }
    double mean = sum / a.length;
    
    double varianceSum = 0;
    for (int num : a) {
        varianceSum += Math.pow(num - mean, 2);
    }
    
    return Math.sqrt(varianceSum / (a.length - 1));
}