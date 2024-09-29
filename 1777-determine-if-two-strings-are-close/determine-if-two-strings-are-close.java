class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        int len1 =word1.length();
        int len2=word2.length();

        if (len1!=len2){
            return false;
        }

        HashMap<Character,Integer> freq1 =new HashMap<>();
        HashMap<Character,Integer> freq2 =new HashMap<>();

        for (int i=0;i<len1;i++){
            char x =word1.charAt(i);

            if (freq1.containsKey(x)){
                freq1.put(x,freq1.get(x)+1);
            } else {
                freq1.put(x,1);
            }
        }

        for (int i=0;i<len2;i++){
            char x =word2.charAt(i);
            if (freq2.containsKey(x)){
                freq2.put(x,freq2.get(x)+1);
            } else {
                freq2.put(x,1);
            }
        }

        if (!freq1.keySet().equals(freq2.keySet())) return false;  //if the char is diffrent


        Integer[] val1 =freq1.values().toArray(new Integer[0]);
        Integer[] val2 =freq2.values().toArray(new Integer[0]);




        Arrays.sort(val1);
        Arrays.sort(val2);

        return Arrays.equals(val1,val2);
    }
}