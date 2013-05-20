package com.scrum;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Problem1 {
	private String line = null;

	public Problem1(String line) {
		this.line = line;
	}

	public String sort() {
		StringTokenizer tokenizer = new StringTokenizer(line, " ");
		int numberOfWords = Integer.parseInt(tokenizer.nextToken());
		String[] words = new String[numberOfWords];
		for (int i = 0; i < numberOfWords; i++) {
			words[i] = tokenizer.nextToken();
		}
		
		Arrays.sort(words, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				String option1 = o1 + o2;
				String option2 = o2 + o1;
				return option1.compareTo(option2);
			}
		});
		
		

		StringBuilder result = new StringBuilder();
		for (String word : words) {
			result.append(word);
		}
		return result.toString();
	}
}
