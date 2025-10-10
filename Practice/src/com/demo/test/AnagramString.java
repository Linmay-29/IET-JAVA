package com.demo.test;

import java.util.Map;

public class AnagramString {

	public static void main(String[] args) {
		String str1="anagram";
		String str2 = "nagraam";
		
		Map<Character,Integer> original = getLetterCount(str1);
		Map<Character,Integer> compare = getLetterCount(str2);
		
		public static Map<Character,Integer> getLetterCount(String input){
			Map<Character,Integer> map = new HashMap();
			for(char ch : input.toCharArray()) {
				map.put(ch, map.getOrDefault(ch, 0)+1);
			}
			return map;
		}

	}

}
