package company.darktheme.find_yours_pets.engine;

import java.io.File;

/**
 * Created by jimmy on 22/10/15.
 */
public class Picture {

    private String name;

    private String description;

    private File picture;

    public Picture(String name, String description, File picture) {
        this.name = name;
        this.description = description;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public File getPicture() {
        return picture;
    }

    public String getDescription() {
        return description;
    }
}
