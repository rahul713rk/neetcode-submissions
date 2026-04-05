class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] map = new int[position.length][2];
        for (int i = 0 ; i<position.length ; i++){
            map[i][0] = position[i];
            map[i][1] = speed[i];
        }
        Arrays.sort(map , (a,b) -> Integer.compare(b[0] , a[0]));

        Stack<Double> stack = new Stack<>();

        for (int i = 0 ; i<position.length ; i++){
            double time = (double) (target-map[i][0])/map[i][1];
            stack.push(time);
            if (stack.size() >=2 && stack.peek() <= stack.get(stack.size()-2)){
                stack.pop();
            }
        }
        return stack.size();
    }
}