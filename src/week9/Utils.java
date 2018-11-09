package week9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utils {

    public static String readContentFromFile(String path) {
        String content = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            int i;
            while ((i = br.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("IO error!");
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException ex) {
                System.out.println("IO error!");
            }
            
        }
        return content;
    }

    public static void writeContentToFile(String path, String content) throws IOException {
        BufferedWriter bw = null;
        FileWriter fw = null;
            fw = new FileWriter(path);
            bw = new BufferedWriter(fw);
            bw.write("\n" + content);
            bw.close();
            fw.close();
    }
    
    public static File findFileByName(String folderPath, String fileName) {
        File tmp = null;
        return tmp;
    }
    
    public static void main(String args[]) throws IOException {
        String path = "D:\\tmp.txt";
        for(int i = 0; i < 10; i++) {
            writeContentToFile(path, "line " + i);
        }
        System.out.println(readContentFromFile(path));
    }
}
