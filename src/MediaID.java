import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *  Hver mediefil hos TV2 skal have et unikt ID, og denne klasse hjælper med at genrere unikke ID'er
 */
public class MediaID {
// Initialising the class to be static. Static is used in this case to show that the program only uses the generate
    // method from this class. Latest id is set to start from 100.
    private static int latestId = 100;

// Creates a public static generate class, that has int as its value.
    public static int generate() {
// Creates a new file, that has its path from media_id.txt (where the ID number is stored)
        File file = new File("media_id.txt");

        // Låser filen op før adgang
        // file.setWritable(true);
// The try block is created if an exception would occur.
        try {

// Creates a new filereader object, and initialises the object with the file.
            if (file.exists()) {
                FileReader fileReader = new FileReader(file);
                Scanner scanner = new Scanner(file);
                latestId = (int) scanner.nextInt();
            }
// Adds 1 to the the latestID. It is a pro increment.
            latestId++;

            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(Integer.toString(latestId));
            fileWriter.close();
// Handling the exceptions that would occur. outprints a stacktrace.
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Låser filen ned for at den ikke redigeres ved en fejl
        // file.setReadOnly();

// Returns the lastid number.
        return latestId;
    }

}