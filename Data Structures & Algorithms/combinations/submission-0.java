class Solution {
    List<List<Integer>> res ;
    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        dfs(n , k , set ,1);
        return res;
    }

    private void dfs(int n , int k , List<Integer> set , int i){
        if (set.size() == k){
            res.add(new ArrayList<>(set));
            return;
        }
        if (i>n || set.size() > k) return;
        set.add(i);
        dfs(n , k , set , i+1);
        set.remove(set.size()-1);
        dfs(n, k , set, i+1);
    }
}