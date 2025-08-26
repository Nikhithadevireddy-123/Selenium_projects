package Day_6;

interface TrafficLight_enum {
	TrafficLight_enum next();
}
 enum TrafficLightColor implements TrafficLight_enum {
    RED {
        @Override
        public TrafficLight_enum next() {
            return GREEN;
        }
    },
    GREEN {
        @Override
        public TrafficLight_enum next() {
            return YELLOW;
        }
    },
    YELLOW {
        @Override
        public TrafficLight_enum next() {
            return RED;
        }
    };
    public class TrafficLight_enum_{
    public static void main(String[] args) {
    	TrafficLight_enum currentState = TrafficLightColor.RED;
        System.out.println("Starting from: " + currentState);

        for (int i = 0; i < 6; i++) {
            currentState = currentState.next();
            System.out.println("Transition " + (i + 1) + ": " + currentState);
        }
    }
    }
}
