package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRevisited {
    public static void main(String[] args) {
        String alphanumeric = "abcDeeeF12Ghhiiiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".", "Y"));
        //Replaces at the beginning of the string
        System.out.println(alphanumeric.replaceAll("^abcDeee", "XXX"));

        String secondAlpha = "abcDeeeF12abcDeeeiiiiijkl99z";
        System.out.println(secondAlpha.replaceAll("^abcDeee", "XXX"));
        System.out.println(alphanumeric.matches("^hello"));
        //String must match the whole string!
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("^abcDeeeF12Ghhiiiiiijkl99z"));
        System.out.println(alphanumeric.replaceAll("99z$", "THE END"));
        System.out.println(alphanumeric.replaceAll("[aei]", "X"));
        //replace a or e  or i followed by F or j
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));
        System.out.println("harry".replaceAll("[Hh]", "H"));
        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));
        //Replace everything but e and j, when we use [^] - it is a character class, not a boundary matcher
        System.out.println(alphanumeric.replaceAll("[^ej]", "X"));

        //Both will do the same:
        System.out.println(alphanumeric.replaceAll("[abcdef345678]", "X"));
        System.out.println(alphanumeric.replaceAll("[a-f3-8]", "X"));

        //Including capital letters (ignoring case sensitivity):
        System.out.println(alphanumeric.replaceAll("[a-fA-F3-8]", "X"));
        System.out.println(alphanumeric.replaceAll("(?i)[a-f3-8]", "X"));

        //Replacing digits
        System.out.println(alphanumeric.replaceAll("[0-9]", "X"));
        System.out.println(alphanumeric.replaceAll("\\d", "X"));
        //replace all non-digits
        System.out.println(alphanumeric.replaceAll("\\D", "X"));

        String hasWhiteSpace = "I have blanks and a\t tab and also a newline \n";
        System.out.println(hasWhiteSpace);
        //removes whitespaces
        System.out.println(hasWhiteSpace.replaceAll("\\s", "X"));
        //removes tab
        System.out.println(hasWhiteSpace.replaceAll("\t", "X"));
        //replace all non-whitespace chars
        System.out.println(hasWhiteSpace.replaceAll("\\S", "X"));
        //replace character set [a-zA-Z0-9_]
        System.out.println(alphanumeric.replaceAll("\\w", "X"));
        System.out.println(hasWhiteSpace.replaceAll("\\w", "X"));

        //Remove all non-alphanumeric chars from the end of the string
        String helloString = "hello Hello HEllo hi hi: hi! Welcome,   welcome^";
        String [] helloArr = helloString.split(" ");
        for (String hello : helloArr){
            System.out.println(hello.replaceAll("\\W$", " "));
        }
        //QUANTIFIERS and the PATTER and MATCHER classes

        System.out.println(secondAlpha);
        System.out.println(secondAlpha.replaceAll("^abcDe{3}", "XXX"));
        System.out.println(secondAlpha.replaceAll("abcDe{3}", "XXX"));
        // replace of if string matches (1<=e) one or more e
        System.out.println(secondAlpha.replaceAll("abcDe+", "XXX"));
        // replace of if string matches (0<=e) ZERO or more e
        System.out.println(secondAlpha.replaceAll("abcDe*", "XXX"));
        // replace if string matches (2<=e<=5) between 2 and 4 e
        System.out.println(secondAlpha.replaceAll("abcDe{2,5}", "XXX"));

        String userName = "Kristina99";
        String userName2 = "Kristina001";
        System.out.println(userName.matches("Kristina\\d{2,5}"));

        //Pattern class example. Usually used with the StringBuilder

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        //If it matches any text before or afer <h2>
        String h2Pattern = ".*<h2>.*";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        String challenge = "Replace all string with underscores";
        //replaces all white spaces with underscores, not just blanks
        challenge.replaceAll("\\s", "_");
        String challenge2 = "aaabbcccc";
        System.out.println(challenge2.matches("[abc]+"));
        System.out.println(challenge2.matches("[a-c]+"));
        System.out.println(challenge2.matches("^a{3}b{2}c{4}$"));
        String challenge3 = "abcd.123";
        System.out.println(challenge3.matches("^[A-z][a-z]+\\.\\d+$"));
        System.out.println(challenge3.matches("^\\w+\\.\\d+$"));
        String challenge4 = "11111";
        System.out.println(challenge4.matches("^\\d{5}$"));
        String challenge5 = "11111-1111";
        System.out.println(challenge5.matches("^\\d{5}(-\\d{4})?$"));
        System.out.println(challenge4.matches("^\\d{5}(-\\d{4})?$"));
        //Only alphabets and spaces are allowed
        String name = "Kristina";
        name.matches("^[a-zA-Z]+[a-zA-Z\\s]*$");
        name.matches("^(?i)[a-z\\s]*$");
        //[] -- means range
       // the name is valid if it contains alphabets and space and it should contain minimum 5 characters and maximum 20 characters.
        name.matches("^[a-zA-Z\\s]{5,20}");
        String name2 = "Ana123";
        // In this case, the name is valid if the first character is an alphabet followed by 3 digits

        name.matches("^[a-zA-Z]\\d{3}$");

    }
}
