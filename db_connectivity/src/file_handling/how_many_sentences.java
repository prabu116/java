package file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class how_many_sentences {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\prabu s\\Downloads\\Telegram Desktop\\file.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            int sentence_count=0;
            int line_count=0;
            int word_count=0;
            while (line!=null){
                line_count++;
                String[] str = line.split("[.]");
                sentence_count+=str.length;
                String[] str1 = line.split(" ");
                word_count+=str1.length;
                System.out.println(line);
                line=bufferedReader.readLine();
            }
            System.out.println("the sentence count is "+sentence_count);
            System.out.println("the line count is "+line_count);
            System.out.println("the word count is "+word_count);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
