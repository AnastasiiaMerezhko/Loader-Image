package app1;

public class ImageView implements UniversalView {
    Adapter adapter;

    @Override
    public void view(String fileType, String fileName) {
        if (fileType.equalsIgnoreCase("jpg") || fileType.equalsIgnoreCase("png")) {
            adapter = new Adapter(fileType);
            adapter.view(fileType, fileName);
        } else {
            System.out.println("Unsupported file type: " + fileType);
        }
    }
}