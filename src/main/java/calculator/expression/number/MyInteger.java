package calculator.expression.number;

public class MyInteger extends MyNewNumber {

    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public MyNewNumber plus(MyNewNumber other) {
        if(other instanceof MyInteger otherInt) {
            return new MyInteger(value + otherInt.getValue());
        }

        return other.plus(this);
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
