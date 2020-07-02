package CaseStudyJame.Models;

public class Dictionary {
    private String vietnamese;
    private String english;
    private String description;

    public Dictionary(String vietnamese, String english, String more) {
        this.vietnamese = vietnamese;
        this.english = english;
        this.description = more;
    }

    public Dictionary() {
    }

    public String getVietnamese() {
        return vietnamese;
    }

    public void setVietnamese(String vietnamese) {
        this.vietnamese = vietnamese;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "vietnamese='" + vietnamese + '\'' +
                ", english='" + english + '\'' +
                ", more='" + description + '\'' +
                '}';
    }
}
