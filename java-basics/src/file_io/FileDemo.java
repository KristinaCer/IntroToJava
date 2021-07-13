package file_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {
        Scanner in = null;
        StringBuilder sb = new StringBuilder();
        try {
            in = new Scanner(new File(FileDemo.class.getResource("log.txt").getFile()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (in.hasNext()) {
            String input = in.next();
            sb.append(input + " ");
        }
        System.out.println(sb.toString());
    }
}
