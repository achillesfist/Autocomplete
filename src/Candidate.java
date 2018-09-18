
public class Candidate {
    String word;
    int confidence;

    public Candidate(String word, int confidence){
        this.word = word;
        this.confidence = confidence;
    }

    public String getWord() { return word; }
    public Integer getConfidence(){ return confidence; }

    public String toString(){
        return "\"" + word +"\" (" + confidence + ")";
    }

}
