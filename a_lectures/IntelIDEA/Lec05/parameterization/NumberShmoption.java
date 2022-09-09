package a_lectures.IntelIDEA.Lec05.parameterization;

import e_algoritms.part001.In;

public class NumberShmoption <N extends Number> extends Shmoption<N>{
    public NumberShmoption(N value) {
        super(value);
    }

    static class IntegerShmoption extends NumberShmoption<Integer> {
        public IntegerShmoption(Integer value) {
            super(value);
        }
    }
}
