package a_lectures.IntelIDEA.Lec04.Interface;

sealed abstract class AbstractVector implements Vector
        permits ArrayVector, FieldVector, ZeroVector {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector)) return false;
        Vector that = (Vector) o;
        return this.component(0) == that.component(0) &&
                this.component(1) == that.component(1) &&
                this.component(2) == that.component(2);
    }

    @Override
    public String toString() {
        return "(" + component(0) + ", " + component(1) + ", " + component(2) + ")";
    }
}
