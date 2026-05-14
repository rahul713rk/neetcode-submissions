/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}
*/

class Solution {
    public Node construct(int[][] grid) {
        int n = grid.length;
        Node res = dfs(grid ,n,0,0);
        return res;
    }
    private Node dfs(int[][] grid , int n , int r , int c){
        boolean allsame = true;

        for (int i = 0 ; i<n ; i++){
            for (int j = 0 ; j<n ; j++){
                if (grid[r][c] != grid[r+i][c+j]){
                    allsame = false;
                    break;
                }
            }
        }

        if (allsame){
            return new Node(grid[r][c] == 1 , true);
        }

        Node topL = dfs(grid , n/2 , r , c);
        Node topR = dfs(grid , n/2 , r ,c+n/2);
        Node bottomL = dfs(grid , n/2 , r+n/2 , c);
        Node bottomR = dfs(grid , n/2 , r+n/2 , c+n/2);
        return new Node(false , false , topL , topR , bottomL , bottomR);
    }
}