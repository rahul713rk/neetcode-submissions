class Solution {
    public String simplifyPath(String path) {
        String[] temp = path.split("/+");
        Stack<String> stack = new Stack<>();

        for (String i : temp){
            if (i.equals("..")){
                if (!stack.isEmpty()) stack.pop();
                else continue;
            }
            else if (i.equals(".") || i.isEmpty()) continue;
            else stack.push(i);
        }

        return  "/"+String.join("/", stack);
    }
}