package creational_patterns.builder_pattern;

public class BuilderDemo {
    public static void main(String[] args) {
        System.out.println("Creating Room using constructor..");
        Room room1 = new Room(100,50,50,"yello","hall",4,true);
        Room room2 = new Room(100,50,50,null,null,2,false);
        System.out.println(room2);

        System.out.println("Creating Room using Builder pattern..");
        Room room3 = new RoomBuilder()
                        .setLength(100)
                        .setBreadth(50)
                        .setHeight(50)
                        .getRoom();
        System.out.println(room3);
    }
}
