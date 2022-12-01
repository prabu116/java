package file_handling;

import java.io.File;
import java.io.FileReader;

public class file_read {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\prabu s\\Downloads\\Telegram Desktop\\file.txt");
            FileReader fileReader = new FileReader(file);
            char[] ch = new char[(int)file.length()];
            fileReader.read(ch);
            for(char c:ch){
                System.out.print(c);
            }



//            int output=fileReader.read();
//           while (output!=-1){
//               System.out.print((char)output);
//               output=fileReader.read();
//           }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
