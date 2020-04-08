class Solution {
    public int countElements(int[] arr) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        Integer key;
        Integer val;
        
        for (int i : arr) {
            key = new Integer(i);
            val = myMap.get(key);
            if (val == null) {
                myMap.put(key, 1);
            }
            else {
                myMap.put(key, val + 1);
            }
        }
        
        int count = 0;
        
        for (int i : arr) {
            key = new Integer(i + 1);
            val = myMap.get(key);
            if (val != null) {
                count++;
            }
        }
        
        return count;
    }
}
