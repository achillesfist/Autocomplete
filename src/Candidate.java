/**
 * This class represents a candidate for the autocomplete algorithm.
 */
public class Candidate implements Comparable<Candidate>{
    /** word represents the algorithm's guess */
    public String word;
    /** confidence represents how confidence the algorithm is in that guess */
    public int confidence;

    public Candidate(String word, int confidence){
        this.word = word;
        this.confidence = confidence;
    }

    public String getWord() { return word; }
    public Integer getConfidence(){ return confidence; }

    @Override
    public String toString(){
        return "\"" + word +"\" (" + confidence + ")";
    }

    @Override
    public int compareTo(Candidate c) {
        if(this.confidence == c.confidence)
            return this.word.compareTo(c.word);
        else
            return this.confidence > c.confidence ? -1 : 1;
    }

}
