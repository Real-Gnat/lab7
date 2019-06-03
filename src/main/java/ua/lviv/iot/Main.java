package ua.lviv.iot;

import ua.lviv.iot.tools.StringProcessor;

import java.util.Scanner;

public class Main {

    public static String readInputText() {
        System.out.println("Enter text:");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            return scanner.nextLine();
        }
        return null;
    }

    public static void main(String[] args) {
        StringProcessor sp = new StringProcessor(readInputText());
        sp.processTextUsingHashMap();
        System.out.println("Processed text:");
        sp.showResults();
    }
}
