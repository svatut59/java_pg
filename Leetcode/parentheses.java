class Solution {
    public boolean isValid(String s) {
        int n =s.length();
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<n; i++) {
            char ch = s.charAt(i);
            if (ch=='{' || ch=='(' ||ch =='[') {
                stack.push(ch);
            }
            if (ch=='}' || ch==')' ||ch ==']') {
                if (stack.empty()) return false;
                char ch2=stack.pop();
                if (ch2!='(') ch2++;
                if (++ch2!=ch) {
                    if (ch2!=')') ch2++;
                    System.out.println("NOT MATCHING   "+ch+"   AND     "+ch2);
                    return false;
                }
            }
        }
        if (stack.empty()) return true;
        return false;
    }
}