public class EvaluatePostfix {
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> st = new Stack<>();
        for(char ch:S.toCharArray()){
            if(Character.isDigit(ch)){
            st.push(ch - '0');
            } else {
                int v1 = st.pop(), v2 = st.pop();
                if(ch == '+') st.push(v2+v1);
                else if(ch == '-')st.push(v2 - v1);
                else if(ch=='*') st.push(v2*v1);
                else st.push(v2/v1);
            }
        }
        return st.pop();
    }
}
