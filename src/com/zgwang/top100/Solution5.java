package com.zgwang.top100;

public class Solution5 {
	public String longestPalindrome(String s){
		int len = 0, from = -1;
		char[] array = s.toCharArray();
		for(int i = 0; i < array.length; i++){
			if(isPalindrome(array, i - len - 1, i)){
				from = i - len -1;
				len += 2;
			}else if(isPalindrome(array, i - len, i)){
				from = i - len;
				len += 1;
			}
		}
		return new String(array, from, len);
	}
	private boolean isPalindrome(char[] arr, int from, int to){
		if(from < 0){
			return false;
		}
		while(from < to){
			if(arr[from++] != arr[to--]){
				return false;
			}
		}
		return true;
	}
}
