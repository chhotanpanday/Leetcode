class Solution {
    public String removeStars(String s) {
      char[] chars = s.toCharArray();
      int sp = 0;
      for(int fp = 0; fp < chars.length; fp++){
        if(chars[fp] == '*'){
            if(sp > 0){
                sp--;
            }
        } else{
            chars[sp++] = chars[fp];
        }
      }  
      return new String(chars, 0, sp);
    }
}