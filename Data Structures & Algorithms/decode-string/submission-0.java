class Solution {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0 ; i<s.length() ; i++){
            String c = String.valueOf(s.charAt(i));
            if (c.equals("]")){
                Stack<String> temp = new Stack<>();
                while (!stack.isEmpty() && !stack.peek().equals("[")){
                    temp.push(stack.pop());
                }
                stack.pop();
                Stack<String> tempnum = new Stack<>();
                while(!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))){
                    tempnum.push(stack.pop());
                }
                Collections.reverse(tempnum);
                int num = Integer.parseInt(String.join("", tempnum));
                Collections.reverse(temp);
                String newStr = String.join("",temp);
                stack.push(newStr.repeat(num));
            }
            else{
                stack.push(c);
            }
        }
        return String.join("",stack);
    }
}