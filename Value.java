
public class Value {
    public static Value VOID = new Value(new Object());

    final Object value;

    public boolean isNumber() {
        return isNumber;
    }

    public void setNumber(boolean number) {
        isNumber = number;
    }

    boolean isNumber = false;

    public Value(Object value) {
        this.value = value;
    }




    public boolean asBoolean() {
        return (Boolean)value;
    }

    public Double asDouble() {
        return Double.parseDouble(value.toString());
    }

    public String asString() {
        return String.valueOf(value);
    }

    public boolean isDouble() {
        return value instanceof Double;
    }

    @Override
    public int hashCode() {

        if(value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(value == o) {
            return true;
        }

        if(value == null || o == null || o.getClass() != this.getClass()) {
            return false;
        }


        Value that = (Value)o;
        if(that.isNumber() || this.isNumber)
        {
            return Double.parseDouble(that.value.toString()) == Double.parseDouble(this.value.toString());
        }
        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
