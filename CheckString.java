class Solution {
    public boolean checkValidString(String s) {
        int balance = 0;
        int star = 0;
        char c;
        
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
            } else {
                star++;
            }
            
            if (balance < 0 && star < (-1) * balance) {
                return false;
            }
        }
        
        balance = 0;
        star = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            c = s.charAt(i);
            if (c == ')') {
                balance++;
            }
            else if (c == '(') {
                balance--;
            }
            else {
                star++;
            }
            
            if (balance < 0 && star < (-1) * balance) {
                return false;
            }
        }
        return true;
    }
}
