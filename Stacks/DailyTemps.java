class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] days = new int[T.length];
        Stack<Integer> s = new Stack<>();
        int check;
        
        for (int i = 0; i < T.length; i++) {
            while (!s.isEmpty()) {
                check = s.peek().intValue();
                if (T[check] < T[i]) {
                    days[check] = i - check;
                    s.pop();
                } else {
                    s.push(i);
                    break;
                }
            }
            s.push(i);
        }
        
        return days;
    }
}
