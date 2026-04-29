class Sentence {
    String text;

    
    Sentence(String text) {
        this.text = text;
    }

    
    void countWords() {
        
        String[] words = text.trim().split("\\s+");

        int count = words.length;

        System.out.println("Sentence: " + text);
        System.out.println("Total Words: " + count);
    }
}


public class p10 {
    public static void main(String[] args) {
        Sentence s1 = new Sentence("Java is very easy to learn");

        s1.countWords();
    }
}
