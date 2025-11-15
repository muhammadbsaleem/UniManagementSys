
import java.util.ArrayList;

public class ResearchProfile {
    private String mainArea;
    private ArrayList<String> publications;

    public ResearchProfile(String mainArea) {
        this.mainArea = mainArea;
        this.publications = new ArrayList<String>();
    }

    public void addPublication(String title) {
        publications.add(title);
    }

    public String getMainArea() {
        return mainArea;
    }

    public ArrayList<String> getPublications() {
        return publications;
    }
}
