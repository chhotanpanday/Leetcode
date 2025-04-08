class Solution {
    public int maxVowels(String s, int k) {
      int n = s.length();
      int count = 0;
      for(int i=0; i<k; i++){
        if(isVowels(s.charAt(i))){
            count++;
        }
      } 
      int maxCount = count;
      for(int i=k; i<n; i++){
        if(isVowels(s.charAt(i))){
            count++;
        }
        if(isVowels(s.charAt(i-k))){
            count--;
        }
        maxCount = Math.max(count,maxCount);
      }
       return maxCount;
    }
    public boolean isVowels(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
}