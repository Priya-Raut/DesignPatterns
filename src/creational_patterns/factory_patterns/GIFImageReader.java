package creational_patterns.factory_patterns;

public class GIFImageReader implements ImageReader {
    @Override
    public void readImage(String imageName) {
        System.out.println(getClass().getSimpleName() + " Reading " + imageName);
    }
}
