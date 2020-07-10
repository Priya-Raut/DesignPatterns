package creational_patterns.builder_pattern;

public class Room {
    private int length;
    private int breadth;
    private int height;
    private String color;
    private String purpose;
    private int numberOfLights;
    private boolean isAirConditionerNeeded;

    public Room(int length, int breadth, int height, String color, String purpose, int numberOfLights, boolean isAirConditionerNeeded) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        this.color = color;
        this.purpose = purpose;
        this.numberOfLights = numberOfLights;
        this.isAirConditionerNeeded = isAirConditionerNeeded;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getNumberOfLights() {
        return numberOfLights;
    }

    public void setNumberOfLights(int numberOfLights) {
        this.numberOfLights = numberOfLights;
    }

    public boolean isAirConditionerNeeded() {
        return isAirConditionerNeeded;
    }

    public void setAirConditionerNeeded(boolean airConditionerNeeded) {
        isAirConditionerNeeded = airConditionerNeeded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", purpose='" + purpose + '\'' +
                ", numberOfLights=" + numberOfLights +
                ", isAirConditionerNeeded=" + isAirConditionerNeeded +
                '}';
    }
}
