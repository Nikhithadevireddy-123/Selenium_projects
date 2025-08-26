package Day_6;
//Shape Area Calculator

public enum Shape_AreaCalculator {
    CIRCLE {
        @Override
        public double area(double... params) {
            if (params.length < 1) throw new IllegalArgumentException("CIRCLE requires radius.");
            return Math.PI * params[0] * params[0]; // pi * r^2
        }
    },
    SQUARE {
        @Override
        public double area(double... params) {
            if (params.length < 1) throw new IllegalArgumentException("SQUARE requires side.");
            return params[0] * params[0]; // side^2
        }
    },
    RECTANGLE {
        @Override
        public double area(double... params) {
            if (params.length < 2) throw new IllegalArgumentException("RECTANGLE requires length and width.");
            return params[0] * params[1]; // length * width
        }
    },
    TRIANGLE {
        @Override
        public double area(double... params) {
            if (params.length < 2) throw new IllegalArgumentException("TRIANGLE requires base and height.");
            return 0.5 * params[0] * params[1]; // 0.5 * base * height
        }
    };

    public abstract double area(double... params);

    public static void main(String[] args) {
        // Sample inputs and printing results
        System.out.println("Circle Area (radius=5): " + Shape_AreaCalculator.CIRCLE.area(5));
        System.out.println("Square Area (side=4): " + Shape_AreaCalculator.SQUARE.area(4));
        System.out.println("Rectangle Area (length=6, width=3): " + Shape_AreaCalculator.RECTANGLE.area(6, 3));
        System.out.println("Triangle Area (base=7, height=4): " + Shape_AreaCalculator.TRIANGLE.area(7, 4));
    }
}
