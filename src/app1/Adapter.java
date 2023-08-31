package app1;

public class Adapter implements UniversalView {
    ImageLoader imageLoader;

    public Adapter(String fileType) {
        if (fileType.equalsIgnoreCase("jpg")) {
            imageLoader = new JpgLoader();
        } else if (fileType.equalsIgnoreCase("png")) {
            imageLoader = new PngLoader();
        }
    }
    @Override
    public void view(String fileType, String fileName) {
        if (imageLoader != null) {
            imageLoader.loadImage(fileName);
        } else {
            System.out.println("Invalid file type: " + fileType);
        }
    }
}