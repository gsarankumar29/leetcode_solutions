class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0;
        int primitiveStart = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                balance++;
            } else {
                balance--;
            }

            if (balance == 0) {
                String primitiveString = s.substring(primitiveStart + 1, i);
                result.append(primitiveString);
                primitiveStart = i + 1;
            }
        }

        return result.toString();
    
    }
}