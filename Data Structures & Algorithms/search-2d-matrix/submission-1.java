class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int Row = matrix.length -1;
        int Col = matrix[0].length -1;
        int top = 0;
        int bottom = Row;

        while (top <= bottom){
            int row = (top+bottom)/2;
            if (target > matrix[row][Col]){
                top = row+1;
            }else if(target < matrix[row][0]){
                bottom = row -1;
            }else{
                break;
            }
        }
        if (top > bottom){
            return false;
        }
        int row = (top + bottom)/2;
        int  l = 0;
        int r = Col;
        while (l<=r){
            int m = (l+r)/2;
            if (target == matrix[row][m]){
                return true;
            }else if (target > matrix[row][m]){
                l = m+1;
            }else{
                r = m-1;
            }
        }
        return false;
    }
}
