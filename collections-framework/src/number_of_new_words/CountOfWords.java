package number_of_new_words;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CountOfWords {
    public static void main(String[] args) {

        System.out.println("Enter Student's Article");
        Scanner scanner = new Scanner(System.in);
        String article = scanner.nextLine();
        String[] articleList = article.toLowerCase().split("\\s+");
        for (int i =0; i< articleList.length; i ++){
            articleList[i] = articleList[i].replaceAll("\\W$", "X");
        }
        System.out.println("Number of words " + articleList.length);
        HashSet<String> uniqueWords = new HashSet<>(Arrays.asList(articleList));
        System.out.println("Number of unique words " + uniqueWords.toArray().length);
        Object[] sorted =  uniqueWords.toArray();
        Arrays.sort(sorted);
        System.out.println("The words are");
        for (int i = 0 ; i < sorted.length ; i ++ ){
            System.out.println(i+1 + ". " + sorted[i]);
        }
        System.out.println("");
    }
}
