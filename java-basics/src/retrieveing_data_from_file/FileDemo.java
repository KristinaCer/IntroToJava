package retrieveing_data_from_file;

import java.io.*;

public class FileDemo {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(new File("log.txt"));
            br = new BufferedReader(fr);
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                             stringBuilder.append(line);
                /*
                stringBuilder.append(line).append("\n");
                scores 0!!!!
                 */
            }
            System.out.println(stringBuilder.toString());
            fr.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
