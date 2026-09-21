class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String curr=tokens[i];
            if(curr.matches("-?\\d+")){
                stk.push(Integer.parseInt(curr));
            }else{
                int sec=stk.pop();
                int fir=stk.pop();
                int res=0;
                if(curr.equals("+")){
                    res=fir+sec;
                }else if(curr.equals("-")){
                    res=fir-sec;
                }else if(curr.equals("*")){
                    res=fir*sec;
                }else{
                    res=fir/sec;
                }
                stk.push(res);
            }
        }
        return stk.peek();
    }
}
