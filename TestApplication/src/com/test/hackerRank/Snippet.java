package com.test.hackerRank;

public class Snippet {

	public static void main(String[] args) {
	
		
		String str = "Hell how are A you doing kSlet me know soon";
		displayTextMessage(str,12);


		

	
		
	}

	private static void displayTextMessage(final String sentence, final int lineLimit) {
		// TODO Auto-generated method stub
	    final String[] words = sentence.split("\\s");
	    final StringBuilder builder = new StringBuilder();
	    final int pages = sentence.length() / lineLimit + 1;

	    int currentPage = 0;
	    int currentWordIndex = 0;
	    int totalCharCount = 0;

	    while(currentWordIndex < words.length) {
	        int potentialWordLength = words[currentWordIndex].length() + 1;
	        if(totalCharCount + potentialWordLength < lineLimit) {
	            builder.append(words[currentWordIndex]);
	            builder.append(" ");
	            totalCharCount = builder.length() - (lineLimit * currentPage - 1);
	            currentWordIndex++;
	        } else {
	            //builder.replace(builder.length() - 1, builder.length(), String.format("(%d/%d)", (currentPage+1), pages));
	            builder.append("\n");
	            currentPage++;
	            totalCharCount = 0;
	        }
	    }
	    //builder.replace(builder.length() - 1, builder.length(), String.format("(%d/%d)", (currentPage+1), pages));
	    System.out.println(builder);
System.out.println(pages);
	}
		
	
}

