package Ex_PersonInterfaceExamples;

public class Brain {
    public String[] divideIntoWords(String text) {
        return text.split(" ");
    }

    public boolean isKnown(String word) {
        return false;
    }
}
