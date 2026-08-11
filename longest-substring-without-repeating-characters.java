import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set = new HashSet<>();

        int i=0, j=0;
        int maxLen=0;

        for(j = 0; j<s.length(); j++)
        {
            while(set.contains(s.charAt(j)))
            {
                set.remove(s.charAt(i));
                i++;
            }
        set.add(s.charAt(j));
        maxLen = Math.max(maxLen , j-i+1);
    }
    return maxLen;
}
}