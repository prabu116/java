package file_handling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class copy_the_file {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\prabu s\\Downloads\\Telegram Desktop\\file.txt");
            FileReader fileReader = new FileReader(file);
            FileWriter fileWriter = new FileWriter("C:\\Users\\prabu s\\Downloads\\Telegram Desktop\\file1.txt");
            int wt = fileReader.read();
            while (wt!=-1){
                fileWriter.write((char)wt);
                wt=fileReader.read();
            }
            fileWriter.flush();
            fileWriter.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
