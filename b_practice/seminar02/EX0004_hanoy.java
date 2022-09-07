package b_practice.seminar02;

public class EX0004_hanoy {
    public static void main(String[] args) {
        hanoy(5, "1", "2", "3");
    }

    public static void hanoy(int disk, String source, String dest, String buffer) {
        if (disk == 1) {
            System.out.println("Перенести диск " + disk + " с " + source + " на " + dest);
            return;
        }
        hanoy(disk - 1, source, buffer, dest);
        System.out.println("Перенести диск " + disk + " с " + source + " на " + dest);
        hanoy(disk - 1, buffer, dest, source);
    }
}
