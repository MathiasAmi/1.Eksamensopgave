public class Picture extends Media {
    // Class variables
    private String filetype = "jpg";
    private int width = 0;
    private int height = 0;
    private String photographName = "";

//Overrides the Media logtoconsol method.
    @Override
    public void logToConsol(){
        System.out.println("Class name = Media");
        System.out.println("filetype = " + filetype);
        System.out.println("width = " + width);
        System.out.println("height = " + height);
        System.out.println("photographName = " + photographName);
        System.out.println("Mediatype = Picture");
    }
}
