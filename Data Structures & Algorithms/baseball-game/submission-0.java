class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String i : operations){
            if (i.equals("+")){
                int top = stack.pop();
                int top2 = stack.peek();
                stack.push(top);
                stack.push(top+top2);
            }else if (i.equals("C")){
                stack.pop();
            }else if (i.equals("D")){
                stack.push(stack.peek()*2);
            }else{
                stack.push(Integer.parseInt(i));
            }
        }
        int res = 0;
        for (int i : stack){
            res += i;
        }
        return res;
    }
}