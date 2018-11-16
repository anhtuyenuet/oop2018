package week10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static List<String> getAllFunctions(String path) throws FileNotFoundException, IOException {
        List<String> List = new ArrayList<>();
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
        int start = content.indexOf("public static");

        return List;
    }

    public static void main(String[] args) throws IOException {
        String path = "src\\week9\\Utils.java";
        List<String> list = Task1.getAllFunctions(path);
        for (String i : list) {
            System.out.println("i");
        }
    }
}
