package a_lectures.IntelIDEA.Lec05.parameterization;

public class Shmoption<T> {
    T value;

    public Shmoption(T value) {
        this.value = value;
    }

    public T get() throws NoSuchFieldException {
        if (value == null) throw new NoSuchFieldException();
        return value;
    }

    public void set(T newValue) {
        value = newValue;
    }

    public T orElse(T other) {
        return value == null ? other : value;
    }

    public boolean isPresent() {
        return value != null;
    }
}

