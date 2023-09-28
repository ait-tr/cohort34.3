package homework.book;

public class Dictionary extends Book{

    private String language;
    private int numberOfWords;
    private String speciality;

    public Dictionary(String title, String author, int yaerOfPublishing, long isbn,
                      String language, int numberOfWords, String speciality) {
        super(title, author, yaerOfPublishing, isbn);
        this.language = language;
        this.numberOfWords = numberOfWords;
        this.speciality = speciality;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getNumberOfWords() {
        return numberOfWords;
    }

    public void setNumberOfWords(int numberOfWords) {
        this.numberOfWords = numberOfWords;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "language='" + language + '\'' +
                ", numberOfWords=" + numberOfWords +
                ", speciality='" + speciality + '\'' +
                '}';
    }

    public void display(){
        super.display();
        System.out.println("Dictionary{" +
                "language='" + language + '\'' +
                ", numberOfWords=" + numberOfWords +
                ", speciality='" + speciality + '\'' +
                '}');
    }
}
