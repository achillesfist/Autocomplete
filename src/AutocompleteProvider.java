import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Evelyn on 7/19/2018.
 */
public class AutocompleteProvider {


    private WeightedTrie = new WeightedTrie();

    AutocompleteProvider(){
        counts = new HashMap<>();
    }

    public String getCounts(){
        String retStr = "";
        int ctr = 0;
        for (String s: counts.keySet())
        {
            ctr++;
            retStr += s + " (" + counts.get(s) + ")";
            if(ctr < counts.size()){
                retStr += ", ";
            }else{
                retStr += " ";
            }
        }
        System.out.println(retStr);
        return retStr;
    }

    public List<Candidate> getWords(String fragment) {
        ArrayList<Candidate> words = new ArrayList<>();
        return words;
    }

    public void train(String passage){
        String[] words = passage.split(" ");
        for(int i = 0; i< words.length; i++){
            String k = words[i];
            if(counts.containsKey(k)){
                counts.put(k, counts.get(k) + 1);
            }else{
                counts.put(k, 1);
            }
        }

    }


}
