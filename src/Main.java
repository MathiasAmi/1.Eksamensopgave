import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
// Belongs to the class, and it is final (cant be changed).
    public static final String SOFTWARE_VERSION = "0.1.0";
    public static final String MEDIA_MAPPE = "media/";
// Creates a main method that has a string.
    public static void main(String[] args) {
// Calls for the Test class, and pushes the messages and code.
        Test.test();

        Media media = new Article();
        media.logToConsol();

        // gets the path for the Media folder.
        logMediaFolder(MEDIA_MAPPE);
        // gets the path for the Media folder.
        readMediaFolderExtend(MEDIA_MAPPE);


    }
    // Creates the method for finding the media folder.
    public static void logMediaFolder(String folderNavn){
        File dir = new File(folderNavn);
        File[] filesList = dir.listFiles();
        for (File file : filesList) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }
    // Creates the method for finding the media folder and returns it as an Arraylist.
    public static File[] readMediaFolder(String folderNavn){
        File dir = new File(folderNavn);
        File[] filesList = dir.listFiles();
        for (File file : filesList) {
            if (file.isFile()) {
                System.out.println(file.getName());




            }
        }
        return filesList;
    }

    public static File[] readMediaFolderExtend(String folderNavn){
        File dir = new File(folderNavn);
        File[] filesList = dir.listFiles();
        for (int i = 0; i < filesList.length; i++) {
            if (filesList[i].isFile()){
                String strings = filesList[i].toString();

                if (strings.contains(".jpg") || strings.contains(".png") || strings.contains(".gif")) {
                    Picture picture = new Picture();
                    System.out.println("A new picture object was created ");
                }

                    else if (strings.contains(".mp4") || strings.contains(".m4v") || strings.contains(".mov")) {
                    Video video = new Video();
                    System.out.println("A new video object was created ");
                }

                        else if (strings.contains(".txt")) {
                    Article article = new Article();
                    System.out.println("A new article object was created ");
                }
                else{
                    System.out.println("Filetype was not recognized ");
                }
                    }
                    else{
                System.out.println("file was not recognized");
            }
                }
return filesList;
            }

        }


