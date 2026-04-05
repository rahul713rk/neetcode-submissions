class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        HashSet<String> ops = new HashSet<>();
        ops.add("+");
        ops.add("-");
        ops.add("*");
        ops.add("/");

        for(String s : tokens){
            if (ops.contains(s)){
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                if (s.equals("+")) stack.push(temp1+temp2);
                else if (s.equals("-")) stack.push(temp2-temp1);
                else if (s.equals("*")) stack.push(temp1*temp2);
                else stack.push((int) temp2/temp1);
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.peek();
    }
}
