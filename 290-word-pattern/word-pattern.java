class Solution {
    public boolean wordPattern(String pattern, String s) {
       String[] patArr= pattern.split("");
       String[] sArr = s.split(" ");

        if (patArr.length != sArr.length) {
            return false;
         }

       int len =pattern.length();

        HashMap<String,String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();





        for (int i=0;i<len;i++){


           if (map1.containsKey(patArr[i])){
               if (!map1.get(patArr[i]).equals(sArr[i])){
                   System.out.println("test:" + patArr[i] + "   " + sArr[i] );
                   return false;
               }

           }
           else {
               map1.put(patArr[i],sArr[i]);
               System.out.println(patArr[i] + "   " + sArr[i] );
           }

           if (map2.containsKey(sArr[i])){
               if(!map2.get(sArr[i]).equals(patArr[i])){
                   return false;
               }
           } else {
               map2.put(sArr[i],patArr[i]);
           }

       }



        return true;
    }
}