import javafx.scene.image.Image;

public class Article extends Media {
// Class variables
    private String authorName = "";
    private String articleText = "";
    private Image image;

    @Override
    public void logToConsol(){
        System.out.println("Class name = Media");
        System.out.println("authorName = " + authorName);
        System.out.println("articleText = " + articleText);
        System.out.println("image = " + image);
        System.out.println("Mediatype = Article");
    }
}
