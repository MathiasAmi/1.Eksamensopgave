import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.Instant;
import java.util.Date;

public class Media {
// Creates variables in a private class. It is hidden from the other classes within the package.
    private int assetId;
    private String name;
    private Date created = new Date();
    private String fileName;

// Uses the generate method from the MediaID class. Shows the date the Media ID was created.
    public Media() {
        assetId = MediaID.generate();
        created = Date.from(Instant.now());
    }
// Getters and setters
    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    // Overrides the original toString method, and returns the new string.
    @Override
    public String toString() {
        return "Media{" +
                "assetId=" + assetId +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", fileName='" + fileName + '\'' +
                '}';
    }
    public void logToConsol(){
        System.out.println("Class name = Media");
        System.out.println("assetId = " + assetId);
        System.out.println("name = " + name);
        System.out.println("Dato = " + created);
        System.out.println("fileName = " + fileName);
        System.out.println("Mediatype = Media");
    }




}

