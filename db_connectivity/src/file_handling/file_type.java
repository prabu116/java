package file_handling;

import java.io.File;

public class file_type {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\prabu s\\Downloads\\Telegram Desktop");
            File[] Farr = file.listFiles();
            for(File f : Farr){
                String Fname = f.getName();
                int index = Fname.lastIndexOf(".");
                String exetension = Fname.substring(index+1);
                //System.out.println(exetension);
                if(exetension.equals("pdf")){
                    System.out.println(Fname+"size is "+Fname.length());
                }

            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
