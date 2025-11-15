
import java.util.ArrayList;

public class ResearchProject {
    private String title;
    private ArrayList<Faculty> investigators;

    public ResearchProject(String title) {
        this.title = title;
        this.investigators = new ArrayList<Faculty>();
    }

    public void addInvestigator(Faculty faculty) {
        if (!investigators.contains(faculty)) {
            investigators.add(faculty);
        }
    }

    public ArrayList<Faculty> getInvestigators() { return investigators; }
    public String getTitle() { return title; }
}
