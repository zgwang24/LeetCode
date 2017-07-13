package com.zgwang.string;

public class Solution520 {
    public boolean detectCapitalUse(String word) {
        return word.matches("[a-z]+|[A-Z]+|[A-Z][a-z]+");
    }
}