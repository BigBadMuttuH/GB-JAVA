package a_lectures.IntelIDEA.Lec07;

import java.util.Comparator;

import static java.util.Comparator.*;

public class Compare_my3 {
    public static void main(String[] args) {

    }

    static class User {
        private final String name;
        private final int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() { return  name; }
        public int getAge() { return age; }

        @Override
        public String toString() {
            return name + ": " + age;
        }

        // lambda!
//        static final Comparator<User> USER_COMPARATOR = (u1, u2) -> {
//            int res = u1.getName().compareTo(u2.getName());
//            return res == 0 ? Integer.compare(u1.getAge(), u2.getAge()) : res;
//        };

        // Комбинаторы
        // тут вообще все красиво!
//        static final Comparator<User> USER_COMPARATOR =
//            Comparator.comparing((User u) -> u.getName())
//                    .thenComparingInt(u -> u.getAge());
//
//            Comparator.comparing((User u) -> u.getName(), Comparator.reverseOrder())
//                .thenComparingInt(u -> u.getAge());
//
//            Comparator.comparing((User u) -> u.getName(), String.CASE_INSENSITIVE_ORDER)
//                .thenComparingInt(u -> u.getAge());
//
//            Comparator.nullsFirst(Comparator.comparing((User u) -> u.getName())
//                .thenComparingInt(u -> u.getAge()));
//
//            Comparator.comparing((User u) -> u.getName(),
//                            Comparator.nullsFirst(Comparator.naturalOrder()))
//                    .thenComparingInt(u -> u.getAge());


//        static final Comparator<User> USER_COMPARATOR =
//            comparing(User::getName).thenComparingInt(User::getAge);
//            comparing(User::getName, reverseOrder()).thenComparingInt(User::getAge);
//            comparing(User::getName, String.CASE_INSENSITIVE_ORDER).thenComparingInt(User::getAge);
//            nullsFirst(comparing(User::getName).thenComparingInt(User::getAge));
//            comparing(User::getName, nullsFirst(naturalOrder())).thenComparingInt(User::getAge);
    }
}
