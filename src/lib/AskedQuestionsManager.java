package lib;

public class AskedQuestionsManager {

    public void askedQuestionsAdd(AskedQuestions askedQuestions) {
        System.out.println("Sık Sorulan Sorular Ekleniyor...");
        System.out.println("Başlık : \n\t" + askedQuestions.questionTitle);
        System.out.println("Açıklama : \n\t" + askedQuestions.questionDescription);
        System.out.println("Soru Durumu : " + (askedQuestions.questionStatus ? "Açık" : "Kapalı"));
        System.out.println();
    }

    public void askedQuestionsUpdate(AskedQuestions askedQuestions) {
        System.out.println("Sık Sorulan Sorular Güncelleniyor...");
        System.out.println(askedQuestions.questionTitle + " Sorusu güncellemeler gerçekleştirildi...");
        System.out.println();
    }

    public void askedQuestionsDelete(AskedQuestions askedQuestions) {
        System.out.println("Sık Sorulan Sorular Siliniyor...");
        System.out.println(askedQuestions.questionTitle + " Sorusu silindi...");
        System.out.println();
    }

}
