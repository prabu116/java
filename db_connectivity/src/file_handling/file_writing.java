package file_handling;

import java.io.File;
import java.io.FileWriter;

public class file_writing {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\prabu s\\Downloads\\Telegram Desktop\\file.txt");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.append("this is character sequence\n");
            fileWriter.write("hi this is from java file\nthis is the next line");
            fileWriter.flush();
            fileWriter.close();

        }catch (Exception e){
            System.out.println(e);
        }


    }
}
