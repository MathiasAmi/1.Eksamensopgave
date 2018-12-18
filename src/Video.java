import java.util.ArrayList;
import java.util.List;

public class Video extends Media {
    // Class variables


    private String filetype = "mp4";
    private String photographName = "";
    private String resolution = "HD";
    private int videoLengthSeconds = 0;

    //Overrides the Media logtoconsol method.
    @Override
    public void logToConsol(){
        System.out.println("Class name = Media");
        System.out.println("filetype = " + filetype);
        System.out.println("photographName = " + photographName);
        System.out.println("resolution = " + resolution);
        System.out.println("videoLengthSeconds = " + videoLengthSeconds);
        System.out.println("Mediatype = Video");
    }


}


