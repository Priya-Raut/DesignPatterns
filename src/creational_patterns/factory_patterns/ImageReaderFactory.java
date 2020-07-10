package creational_patterns.factory_patterns;

import com.sun.tools.javac.code.Attribute;

import static creational_patterns.factory_patterns.ImageReaderFactory.ImageType.*;

public class ImageReaderFactory{
    public enum ImageType {
        GIF, PNG, JPEG
    }
    public ImageReader getImageReader(ImageType imageType){
        switch(imageType){
            case GIF:
                return new GIFImageReader();
            case PNG:
                return new PNGImageReader();
            case JPEG:
                return new JPEGImageReader();
            default:
                throw new IllegalArgumentException();
        }
    }
}
