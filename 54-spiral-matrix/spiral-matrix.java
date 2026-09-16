class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int sr = 0;
        int er = matrix.length-1;
        int sc = 0;
        int ec = matrix[0].length-1;
        int total_elements=matrix.length*matrix[0].length;
        int count=0;
        List<Integer> spiral = new ArrayList<>();
        while (count<total_elements) {
            for (int j=sc; j<=ec && count<total_elements; j++) {
                spiral.add(matrix[sr][j]);
                count++;
            }
            sr++;
            for (int i=sr; i<=er && count<total_elements; i++) {
                spiral.add(matrix[i][ec]);
                count++;
            }
            ec--;
            for (int j=ec; j>=sc && count<total_elements; j--) {
                spiral.add(matrix[er][j]);
                count++;
            }
            er--;
            for (int i=er; i>=sr && count<total_elements; i--) {
                spiral.add(matrix[i][sc]);
                count++;
            }
            sc++;
        }
        return spiral;
    }
}