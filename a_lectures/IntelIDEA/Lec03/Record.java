package a_lectures.IntelIDEA.Lec03;

public record Record() {
    public record Point(int x, int y) {
        public void print() {
            System.out.println("Point<" + x + "," + y + ">");
        }
    }
}
