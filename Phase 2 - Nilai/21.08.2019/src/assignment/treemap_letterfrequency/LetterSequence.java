package assignment.treemap_letterfrequency;

import java.util.Map.Entry;
import java.util.TreeMap;

public class LetterSequence {

	private String sentence;
	private TreeMap<Character, Integer> map = null;

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	public LetterSequence(String sentence) {
		super();
		this.sentence = sentence;
	}

	public TreeMap<Character, Integer> computeFrequency() {

		map = new TreeMap<Character, Integer>();
		char ch;
		int[] frequency = new int[sentence.length()];
		char[] sentence = this.sentence.toCharArray();
		for (int i = 0; i < this.sentence.length(); i++) {

			frequency[i] = 1;
			for (int j = i + 1; j < this.sentence.length(); j++) {
				if (sentence[i] == sentence[j]) {
					frequency[i]++;
					sentence[j] = '0';
				}

			}

		}
		//System.out.println(frequency.length);

		for (int i = 0; i < frequency.length; i++) {
			if (sentence[i] != ' ' && sentence[i] != '0') {
				map.put(sentence[i], frequency[i]);
				//System.out.println(string[i] + " " + frequency[i]);
			}
		}

		return map;

	}

	public void displayLetterFrequency(TreeMap<Character, Integer> frequencyMap) {
		for (Entry<Character, Integer> map : frequencyMap.entrySet()) {
			System.out.print(map.getKey() + ":");
			generateStars(map.getValue());
			System.out.println("\n");
		}
	}
	void generateStars(int num)
	{
		for(int i=0; i<num; i++)
			System.out.print("*");
	}
}


