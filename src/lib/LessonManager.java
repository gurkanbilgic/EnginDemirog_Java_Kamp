package lib;

public class LessonManager {

    public void lessonAdd(Lesson lesson) {
        System.out.println("Kurs Ekleniyor...");
        System.out.println("Eğitmen Ad Soyad : " + lesson.teacherName + " " + lesson.teacherSurname);
        System.out.println("Kurs Adı : " + lesson.courseTitle);
        System.out.println("Kurs Açıklama : " + lesson.courseDescription);
        System.out.println("Kurs Görsel : " + lesson.courseVisual);
        System.out.println("Kurs Süre : [" + lesson.courseTime + "]");
        System.out.println("Kurs Ücreti : " + (lesson.courseFee ? "Ücretli" : "Ücretsiz"));
        System.out.println("Kurs Durum : " + (lesson.courseStatus ? "Yayında" : "Yayında Değil"));
        System.out.println();
    }

    public void lessonDelete(Lesson lesson) {
        System.out.println("Kurs Siliniyor...");
        System.out.println(lesson.teacherName + " " + lesson.teacherSurname + "'a ait " + lesson.courseTitle + " kursu silinmiştir.");
    }

}
