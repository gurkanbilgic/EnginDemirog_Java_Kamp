import lib.*;

public class Main {
    public static void main(String[] args) {

        // Lesson
        Lesson courseOperations = new Lesson();
        courseOperations.teacherName = "Engin";
        courseOperations.teacherSurname = "Demiroğ";
        courseOperations.courseTitle = "Youtube Java ve React Kampı";
        courseOperations.courseDescription = "Youtube üzerinden ücretsiz Java ve React Kampına katılmak için geç kalmayın...";
        courseOperations.courseVisual = "https://miro.medium.com/max/814/1*UCZP7y-Iv1GItLJAO-5nxw.png";
        courseOperations.courseTime = "45 Saat";
        courseOperations.courseFee = false;
        courseOperations.courseStatus = true;

        Lesson courseOperationsTwo = new Lesson(
            "Engin",
            "Demiroğ",
            "Youtube C# Angular Kampı",
            "Youtube üzerinden ücretsiz C# ve Angular Kampına katılmak için geç kalmayın...",
            "https://i.imgur.com/kr0NhBb.jpg",
            "60 Saat",
            true,
            true);

        Lesson[] courseInformation = { courseOperations, courseOperationsTwo };
        LessonManager lessonManager = new LessonManager();

        for (Lesson lesson : courseInformation) {
            lessonManager.lessonAdd(lesson);
        }

        System.out.println("\nKurs Bilgisinin Silinmesi...");
        lessonManager.lessonDelete(courseOperationsTwo);
        // #Lesson

        // Asked Questions
        System.out.println("\n\nSık Sorulan Sorular İşlemleri Gerçekleştiriliyor...");
        AskedQuestions askedQuestionsOne = new AskedQuestions();
        askedQuestionsOne.questionTitle = "Yazılım Geliştirici Yetiştirme Kampı ücretsiz mi olacak?";
        askedQuestionsOne.questionDescription = "Evet, ücretsiz olacak.";
        askedQuestionsOne.questionStatus = true;

        AskedQuestions askedQuestionsTwo = new AskedQuestions(
            "Yazılım Geliştirici Yetiştirme Kamp programı ne kadar sürecek?",
            "Ücretsiz olarak vereceğim bu kamp 2 ay boyunca sürecek.",
            true);

        AskedQuestions askedQuestionsThree = new AskedQuestions(
            "Canlı yayına katılamayacak kişilerin, tekrarını izleme gibi bir şansı olacak mı?",
            "Evet, canlı yayından sonra kodlama.io 'ya ekleyeceğiz.",
            true);

        AskedQuestions askedQuestionsFour = new AskedQuestions(
            "Kamp programında neler olacak?",
            "Detaylı kamp programına ulaşmak için bağlantıyı tıklayınız.",
            false);

        AskedQuestions[] askedQuestions = {
            askedQuestionsOne,
            askedQuestionsTwo,
            askedQuestionsThree,
            askedQuestionsFour
        };

        AskedQuestionsManager askedQuestionsManager = new AskedQuestionsManager();

        for (int e = 0; e < askedQuestions.length; e++) {
            askedQuestionsManager.askedQuestionsAdd(askedQuestions[e]);
        }

        askedQuestionsManager.askedQuestionsUpdate(askedQuestionsThree);

        askedQuestionsManager.askedQuestionsDelete(askedQuestionsFour);
        // #Asked Questions

    }
}
