class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int sr = 0;
        int er = matrix.length-1;
        int sc = 0;
        int ec = matrix[0].length-1;
        List<Integer> spiral = new ArrayList<>();
        while (sr<=er && sc<=ec) {
            for (int j=sc; j<=ec; j++) {
                spiral.add(matrix[sr][j]);
            }
            sr++;
            for (int i=sr; i<=er; i++) {
                spiral.add(matrix[i][ec]);
            }
            ec--;
            if (sr<=er) {
                for (int j=ec; j>=sc; j--) {
                    spiral.add(matrix[er][j]);
                }
                er--;
            }
            if (sc<=ec) {
                for (int i=er; i>=sr; i--) {
                    spiral.add(matrix[i][sc]);
                }
                sc++;
            }
        }
        return spiral;
    }
}
