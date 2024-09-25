class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        
        int answer=0;

     for(int i=1;i<=len;i++){
        int count=0;
        for(int j=0;j<len;j++){
            if(i<=citations[j])count++;
        }
        if(count>=i){
            answer=Math.max(answer,i);
        }
    }

     return answer;
    }
}