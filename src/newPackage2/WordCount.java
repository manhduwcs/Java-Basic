package newPackage2;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int countWord = 0;
	int countCharacter = 0;
	String word = "";
	System.out.print("Please enter your text here : ");
	word = sc.nextLine();
	word = word.trim();

	System.out.println(word);
	char[] charword = word.toCharArray();

	for (int i = 0; i < charword.length; i++) {
	    if (i == (charword.length - 1)) {
		countWord++;
		break;
	    }
	    if (charword[i] != ' ') {
		for (int j = i + 1; j < charword.length - 1; j++) {
		    if (charword[j] == ' ') {
			countWord++;
			i = j;
			break;
		    }
		}
	    }
	}
	System.out.println("Word Count = " + countWord);
    }
}
