package file_handling;

import java.io.*;

public class buffered_reader_writer {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\prabu s\\Downloads\\Telegram Desktop\\file.txt");
//            FileWriter fileReader = new FileWriter(file);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileReader);
//            bufferedWriter.write("\nthis line from buffer writer");
//            bufferedWriter.newLine();
//            bufferedWriter.write("this is second");
//            bufferedWriter.newLine();
//            bufferedWriter.write("this is third");
//            bufferedWriter.flush();
//            bufferedWriter.close();
//



            FileReader fileReader1 = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader1);
            //System.out.println(bufferedReader.readLine());
            String line = bufferedReader.readLine();
            int line1=bufferedReader.read();
            int line_count=0;
            while (line!=null){
                line_count++;
                System.out.println(line);
                line=bufferedReader.readLine();
            }
            System.out.println("total line is "+line_count);


            System.out.println("the file length is "+file.length());
//            while (line!=null){
//                System.out.println(line);
//                line=bufferedReader.readLine();
//            }




        }catch (Exception e){
            System.out.println(e);
        }
    }
}
