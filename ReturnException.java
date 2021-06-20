public class ReturnException extends Exception {
    private Value value;

    public ReturnException(Value value) {
        this.value = value;
    }

    public Value getValue() {
        return value;
    }
}
