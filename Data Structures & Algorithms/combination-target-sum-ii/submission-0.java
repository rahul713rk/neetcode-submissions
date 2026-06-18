class Solution {
    HashSet<List<Integer>> res = new HashSet<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> set = new ArrayList<>();
        dfs(candidates , target , set , 0);

        return new ArrayList<>(res);
    }
    private void dfs(int[] c , int t , List<Integer> set , int i){
        if (t == 0){
            res.add(new ArrayList<>(set));
            return;
        }
        if (t<0 || i >= c.length) return;

        set.add(c[i]);
        dfs(c , t-c[i] , set , i+1);
        set.remove(set.size()-1);
        while(i+1 < c.length && c[i] == c[i+1]){
            i++;
        }
        dfs(c , t , set , i+1);
    }
}
