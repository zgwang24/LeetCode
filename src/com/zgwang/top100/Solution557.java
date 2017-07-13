package com.zgwang.top100;

public class Solution557 {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String item : arr){
            sb.append(new StringBuilder(item).reverse()).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}