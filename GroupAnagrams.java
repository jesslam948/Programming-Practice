class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> grouped = new ArrayList<List<String>>();
        
        HashMap<String, Integer> myMap = new HashMap<>();
        char[] c;
        String ann;
        Integer annInd;
        
        for (String s : strs) {
            c = s.toCharArray();
            Arrays.sort(c);
            ann = new String(c);
            annInd = myMap.get(ann);
            if (annInd != null) {
                grouped.get(annInd.intValue()).add(s);
            }
            else {
                myMap.put(ann, new Integer(myMap.size()));
                List<String> temp = new ArrayList<String>();
                temp.add(s);
                grouped.add(temp);
            }
        }
        
        return grouped;
        
    }
}
