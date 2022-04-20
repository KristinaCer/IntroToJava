package number_of_new_words.number_of_new_words;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountOfWords {
  public static void main(String[] args) {

    System.out.println("Enter Student's Article \n");
    Scanner scanner = new Scanner(System.in);
    String[] article = scanner.nextLine().split(" ");
    System.out.printf("Number of words %d \n", article.length);
    IntStream.range(0, article.length)
        .forEach(
            i -> {
              article[i] = article[i].toLowerCase().replaceAll("\\W$", "");
            });
    List<String> uniqueWord = Arrays.stream(article).distinct().sorted().collect(Collectors.toList());
    System.out.printf("Number of unique words %d \n", uniqueWord.size());
    System.out.println("The words are \n");
    IntStream.range(0, uniqueWord.size())
        .forEach(
            idx -> {
              if (uniqueWord.get(idx).length() > 0) {
                System.out.printf("%d. %s \n", idx + 1, uniqueWord.get(idx));
              }
            });
    System.out.println("");
  }
}
