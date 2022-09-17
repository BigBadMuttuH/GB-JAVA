package a_lectures.GeekBrains.Part1Syntax;

import  java.util.Scanner;

public class inputData {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("name: ");
        String name = iScanner.nextLine();
        String s = String.format("Hello, %s!\n", name);
        // byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        //  String out = new String(bytes, StandardCharsets.UTF_8);
        //  System.out.printf(out);
        System.out.printf(s);

        System.out.print("int a: ");
        boolean flag = iScanner.hasNextInt();
        System.out.println(flag);
        int i = iScanner.nextInt();
        System.out.println(i);
        iScanner.close();
    }
}
