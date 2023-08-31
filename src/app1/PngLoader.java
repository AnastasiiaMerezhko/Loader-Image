package app1;

public class PngLoader implements ImageLoader {
    @Override
    public void loadImage(String fileName) {
        System.out.println("Loading png image: " + fileName);
    }
}