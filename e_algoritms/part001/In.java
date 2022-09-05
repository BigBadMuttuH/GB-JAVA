package e_algoritms.part001;


import java.io.BufferedReader;
import java.io.FileReader;

public class In {
    public static Iterable<Integer> ReadInts(String filePath) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String str;
        while ((str = br.readLine()) != null) {

        }
        return null;
    }
}
