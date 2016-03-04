package example.abhishek.com.materialdesign.CustomizeGallery;

/**
 * Created by Abhishek on 27-02-2016.
 */
public enum ExtraArgumentKeys {

    OPEN_ACTIVITES("OPEN_ACTIVITES");

    private String text;

    private ExtraArgumentKeys(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

}
