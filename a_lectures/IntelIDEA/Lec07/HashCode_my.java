package a_lectures.IntelIDEA.Lec07;

public class HashCode_my {
    public static void main(String[] args) {

    }

    final class Pair{
        char a, b;

        @Override
        public int hashCode() {
            // тут нужно бы аккуратней
            // у битового сдвига приоритет ниже чем у сложения
//            return a << 16 + b;
            // вот так правильно
            return (a << 16) + b;

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Pair)) return false;
            Pair pair = (Pair) o;
            return a == pair.a && b == pair.b;
        }
    }
}
