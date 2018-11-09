package week9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Utils {

    public static String readContentFromFile(String path) throws IOException {
        String content = "";
        FileReader fr;
        BufferedReader br;
        fr = new FileReader(path);
        br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            content += line + "\n";
        }
        br.close();
        fr.close();
        return content;
    }

    public static void writeContentToFile(String path, String content) throws IOException {
        BufferedWriter bw;
        FileWriter fw;
        fw = new FileWriter(path, false);
        bw = new BufferedWriter(fw);
        bw.write(content + "\n");
        bw.close();
        fw.close();
    }

    public static File findFileByName(String folderPath, String fileName) {
        File tmp = null;
        File dir = new File(folderPath);
        File[] list = dir.listFiles();
        if (list == null) {
            System.out.println("Does not exist or is not a directory");
        } else {
            for (int i = 0; i < list.length; i++) {
                if (fileName.equals(list[i].getName())) {
                    tmp = list[i];
                    break;
                }
            }
        }
        return tmp;
    }

    public static void main(String args[]) throws IOException {
        String path = "D:\\tmp.txt";
        writeContentToFile(path, "new line");
        System.out.println(readContentFromFile(path));
        File tmp = findFileByName("z:\\", "tmp1.txt");
        if (tmp != null) {
            System.out.println(tmp.getName() + " | " + tmp.length() + " bytes");
        } else {
            System.out.println("Not found!");
        }
    }
}
