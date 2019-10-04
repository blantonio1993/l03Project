package Model;

public class Height {

    protected int feet;

    protected int inches;


    public Height(int feet, int inches) {

        this.feet = feet;

        this.inches = inches;

    }

    public Height() {
        this(5,11);
    }

    public String toString() {

        return (feet + "'" + inches + "\"");

    }

}