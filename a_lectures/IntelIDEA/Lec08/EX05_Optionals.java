package a_lectures.IntelIDEA.Lec08;

import java.util.Optional;

public class EX05_Optionals {
    public static void main(String[] args) {

    }
    interface User {
        String name();
        boolean isActive();
        void updateCarma(int delta);
    }
    interface UserRepository {
        Optional<User> findUser(String name);
    }

    void increaseUserCarma(UserRepository repository, String name) {
        repository.findUser(name)
                .filter(User::isActive)
//                .ifPresent(user -> user.updateCarma(1));
                .orElseThrow(() -> new IllegalArgumentException("No such user: " + name))
                .updateCarma(1);
    }
}
