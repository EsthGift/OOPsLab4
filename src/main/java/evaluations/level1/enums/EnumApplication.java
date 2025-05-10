package evaluations.level1.enums;

public class EnumApplication {
    public TrafficLight nextLight (TrafficLight trafficLight){
        switch (trafficLight){
            case RED:
                return TrafficLight.GREEN;
            case GREEN:
                return TrafficLight.YELLOW;
            case YELLOW:
                return TrafficLight.RED;
            default:
                return TrafficLight.RED;
        }
    }

}
