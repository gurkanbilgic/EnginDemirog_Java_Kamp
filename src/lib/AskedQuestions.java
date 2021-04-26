package lib;

public class AskedQuestions {

    public String questionTitle;
    public String questionDescription;
    public boolean questionStatus;

    public AskedQuestions() {
        
    }

    public AskedQuestions(String questionTitle, String questionDescription, boolean status) {
        this();
        this.questionTitle = questionTitle;
        this.questionDescription = questionDescription;
        this.questionStatus = status;
    }

}
