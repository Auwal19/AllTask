public static int[][] matrixAdd(int[][] a, int[][] b) {
    if (a.length == 0 || b.length == 0) {
        return new int[0][0];
    }
    
    int rows = a.length;
    int cols = a[0].length;
    int[][] result = new int[rows][cols];
    
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            result[i][j] = a[i][j] + b[i][j];
        }
    }
    
    return result;
}