package ua.lviv.iot.tools;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StringProcessor {

    private String inputText;
    private StringBuilder resultStrBuilder;
    private String[] alphabet = {"a", "b", "c", "d", "e", "f",
            "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
            "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public StringProcessor() {
    }

    public StringProcessor(String inputText) {
        this.inputText = inputText;
    }

    public void processTextUsingHashMap() {
        resultStrBuilder = new StringBuilder();
        Map<String, List<String>> wordsMap = new LinkedHashMap<>();
        String[] tempWordList = inputText.split("[^a-zA-Z']+");
        boolean wasAppended;

        for (String key : alphabet) {
            wordsMap.put(key, new LinkedList<>());
        }

        for (String tempWord : tempWordList) {
            wordsMap.get(tempWord.toLowerCase().subSequence(0, 1)).add(tempWord);
        }

        resultStrBuilder.append("\t");
        for (Map.Entry<String, List<String>> entry : wordsMap.entrySet()) {
            wasAppended = false;
            for (String word : entry.getValue()) {
                resultStrBuilder.append(word).append(" ");
                wasAppended = true;
            }
            if (wasAppended) {
                resultStrBuilder.append("\n\t");
            }
        }
    }

    public String getResultString() {
        return resultStrBuilder.toString();
    }

    public void showResults() {
        System.out.println(this.getResultString());
    }

    public String getInputText() {
        return inputText;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }
}
