package com;

/**
 * Created by guoyu on 10/8/2016.
 */
public class LenOfLonSubStr {
    public static int lengthOfLongestSubstring(String s) {
        int max = 1;
        int count = 1;
        for(int i = 0; i+1 < s.length();i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                count++;
            }else{
                if(count>max){
                    max = count;
                }
                count = 1;
            }


        }
        if(count>max){
            max = count;
        }

        return max;

    }

    public static void main(String args[]){
        System.out.print(lengthOfLongestSubstring("abcabcbb"));
    }
}
