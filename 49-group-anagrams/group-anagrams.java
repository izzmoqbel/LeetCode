class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String,ArrayList<String>> map = new HashMap<>();
        int len = strs.length;

        for (int i=0;i<len;i++){
            char[] ch =strs[i].toCharArray();
            Arrays.sort(ch);

            String string = String.valueOf(ch);
            //System.out.println(string);
            if (!map.containsKey(string)) {
                map.put(string,new ArrayList<>());
            }

            
            map.get(string).add(strs[i]);

        }

        return new ArrayList<>(map.values());
    }
}