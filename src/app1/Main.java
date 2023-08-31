package app1;

public class Main {

    public static void main(String[] args) {

        ImageView imageView = new ImageView();

        imageView.view("jpg", "image1.jpg");
        imageView.view("png", "image2.png");
        imageView.view("bmp", "image3.bmp");
    }
}