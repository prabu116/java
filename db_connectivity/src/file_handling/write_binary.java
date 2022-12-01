package file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class write_binary {
    public static void main(String[] args) {
        try {
//            FileOutputStream f = new FileOutputStream("D:\\file.txt");
//            String s = "prabu";
//            byte[] b =s.getBytes();
//            f.write(b);
//            f.close();
//            FileInputStream f = new FileInputStream("D:\\\\file.txt");
//            System.out.println(f.read());
            File f = new File("C:\\Program Files (x86)");
            String[] list = f.list();
            for(int i=0;i<list.length;i++){
                System.out.println(list[i]);
            }

//            f.mkdir();
//            System.out.println("the folder is exists"+f.exists());
//            System.out.println("folder  is created");


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
