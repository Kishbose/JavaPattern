package JavaPatterns;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeatative {

		public static void main(String[] args) {

			String s = "java selenium java api jira jira git git git jenkins";

			Map<String, Integer> m = new LinkedHashMap<>();
			String[] allWords = s.split(" ");

			for (String word : allWords) {

				if (m.containsKey(word)) {
					Integer value = m.get(word);
					m.put(word, value+1);
				} else {
					m.put(word, 1);
				}
			}
			System.out.println(m);
			
			Set<Entry<String, Integer>> entrySet = m.entrySet();
			
			for (Entry<String, Integer> entry : entrySet) {
				if (entry.getValue()>1) {
					System.out.println(entry);
				}
			}
			
		}
	}


