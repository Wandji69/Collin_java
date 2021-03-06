/**
 * Exercise 14.9 : Print Sentence With Words Reversed
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseSentence {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter A Sentence : ");
        String sentence = scanner.nextLine();

        StringBuilder Sentence = new StringBuilder(sentence);

        StringBuilder sentenceReversed = Sentence.reverse();

        System.out.printf("\n\"%s\" \n\nNow Printed With Words Reversed Is \n\"%s\"\n\n", sentence, sentenceReversed);

        String[] tokens = sentence.split(" ");

        System.out.printf("\n\"%s\" \n\nNow Printed With Words Printed In Reverse Order Is \n\n \"", sentence );
        for (int i = tokens.length-1 ; i >= 0; i-- )
            System.out.printf("%s ", tokens[i]);
        System.out.printf("\"\n");
    }
}