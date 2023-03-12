package com.leetcode.answers.medium.longestsubstring;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s.length();
        }

        Map<Character, Integer> occurrences = new HashMap<>();
        int longestSubstringLength = 0;
        int currLength = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                if (currLength > longestSubstringLength) {
                    longestSubstringLength = currLength;
                }
                break;
            }

            char currentChar = s.charAt(i);
            char nextChar = s.charAt(i + 1);
            occurrences.put(currentChar, i);
            if (occurrences.containsKey(nextChar)) {
                if (currLength > longestSubstringLength) {
                    longestSubstringLength = currLength;
                }
                i = occurrences.get(nextChar);
                currLength = 1;
                occurrences.clear();
            } else {
                currLength++;
            }
        }

        return longestSubstringLength;
    }

}
