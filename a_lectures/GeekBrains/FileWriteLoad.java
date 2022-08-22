package a_lectures.GeekBrains;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteLoad {
    public static void main(String[] args) throws Exception {
        WriteToFile();
        LoadFromFile();
    }

    private static void WriteToFile() {
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.write("line 2");
            fw.append('\n');
            fw.write("line 3");
            fw.flush(); // принудительная запись в файл
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void LoadFromFile() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
}
