package Day_6;

public enum OperationSwitch {
    PLUS, MINUS, TIMES, DIVIDE;
	
    public double eval(double a, double b) {
        switch (this) {
            case PLUS:
                return a + b;
            case MINUS:
                return a - b;
            case TIMES:
                return a * b;
            case DIVIDE:
                if (b == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero");
                }
                return a / b;
            default:
                throw new AssertionError("Unknown operation: " + this);
        }
            public static void main(String[] args) {
                double a = 10;
                double b = 5;
                OperationSwitch a=OperationSwitch(a, b);
                

               
    }
    }
