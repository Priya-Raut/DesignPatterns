package creational_patterns.factory_patterns;

import static creational_patterns.factory_patterns.ImageReaderFactory.ImageType.GIF;

public class ImageFactoryDemo {
    public static void main(String[] args) {
        ImageReaderFactory factory = new ImageReaderFactory();
        factory.getImageReader(GIF).readImage("Monalisa");
    }
}
