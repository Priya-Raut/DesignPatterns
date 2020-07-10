package creational_patterns.builder_pattern;

public class RoomBuilder {
    private int length;
    private int breadth;
    private int height;
    private String color;
    private String purpose;
    private int numberOfLights;
    private boolean isAirConditionerNeeded;

    public RoomBuilder setLength(int length) {
        this.length = length;
        return this;
    }

    public RoomBuilder setBreadth(int breadth) {
        this.breadth = breadth;
        return this;
    }

    public RoomBuilder setHeight(int height) {
        this.height = height;
        return this;
    }

    public RoomBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public RoomBuilder setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }

    public RoomBuilder setNumberOfLights(int numberOfLights) {
        this.numberOfLights = numberOfLights;
        return this;
    }

    public RoomBuilder setAirConditionerNeeded(boolean airConditionerNeeded) {
        isAirConditionerNeeded = airConditionerNeeded;
        return this;
    }

    public Room getRoom(){
        return new Room(length, breadth, height, color, purpose, numberOfLights, isAirConditionerNeeded);
    }
}
