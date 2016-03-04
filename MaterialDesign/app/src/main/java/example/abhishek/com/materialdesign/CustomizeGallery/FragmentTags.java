package example.abhishek.com.materialdesign.CustomizeGallery;

/**
 * Created by Abhishek on 27-02-2016.
 */
public enum FragmentTags {
    LIST_BUDDIES("SpardhaGalerryFragment"),
    CUSTOMIZE("CustomizeFragment");

    private String text;

    private FragmentTags(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
