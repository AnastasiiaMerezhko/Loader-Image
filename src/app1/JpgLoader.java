package app1;

public class JpgLoader implements ImageLoader {
    @Override
    public void loadImage(String fileName) {
        System.out.println("Loading jpg image: " + fileName);
    }
}