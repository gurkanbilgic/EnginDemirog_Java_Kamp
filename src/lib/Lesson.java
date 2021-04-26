package lib;

public class Lesson {

    public String teacherName;
    public String teacherSurname;
    public String courseTitle;
    public String courseDescription;
    public String courseVisual;
    public String courseTime;
    public boolean courseFee;
    public boolean courseStatus;

    public Lesson() {

    }

    public Lesson(
        String teacherName,
        String teacherSurname,
        String courseTitle,
        String courseDescription,
        String courseVisual,
        String courseTime,
        boolean courseFee,
        boolean courseStatus){
            this.teacherName = teacherName;
            this.teacherSurname = teacherSurname;
            this.courseTitle = courseTitle;
            this.courseDescription = courseDescription;
            this.courseVisual = courseVisual;
            this.courseTime = courseTime;
            this.courseFee = courseFee;
            this.courseStatus = courseStatus;
    }

}
