class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<Character>();
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' ){
                if(st.size()>0){
                sb.append(s.charAt(i));
                }
                st.push(s.charAt(i));
            }
            else{
                st.pop();
                if(st.size()>0){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}



// class Solution {
//     public String removeOuterParentheses(String s) {
//         int count = 0;
//         StringBuilder str = new StringBuilder();
        
//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == '(') {
//                 if (count != 0) {
//                     str.append(s.charAt(i));
//                 }
//                 count++;
//             } else {
//                 count--;
//                 if (count != 0) {
//                     str.append(s.charAt(i));
//                 }
//             }
//         } 

//         return str.toString();
//     }
// }
