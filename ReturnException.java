public class ReturnException extends RuntimeException {
    private Value value;

    public ReturnException(Value value) {
        this.value = value;
    }

    public Value getValue() {
        return value;
    }
}
