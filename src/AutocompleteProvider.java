import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class AutocompleteProvider {

    public Node trie = new Node("");

    /**
     * First we remove all punctuation and capitalization, then we split it into an array of strings.
     * Then we loop through the array and insert each word into the trie
     * @param passage : the passage you are training on
     */
    public void train(String passage){
        String[] dict = passage.replaceAll("[^a-zA-Z ]", "").toLowerCase().split(" ");
        for(String s : dict){
            learnWord(s);
        }
    }

    /**
     * This is the method that adds a word to the Trie
     * @param word : word to be added
     */
    private void learnWord(String word){
        Node curr = trie;
        for(int i = 0; i < word.length(); i++){
            if(!curr.children.containsKey(word.charAt(i))){
                //Does not contain this letter, add new Node
                curr.children.put(word.charAt(i), new Node(word.substring(0, i+1)));
            }
            curr = curr.children.get(word.charAt(i));
            if(i == word.length() - 1){
                curr.isWord = true;
                curr.weight++;
            }
        }
    }

    /**
     * This is the method that returns the autocomplete suggestions
     * @param fragment
     */

    public List<Candidate> getWords(String fragment){
        List<Candidate> results = new LinkedList<>();

        Node curr = trie;
        for(char c : fragment.toCharArray()){
            if(curr.children.containsKey(c)){
                curr = curr.children.get(c);
            }else{
                return results;
            }
        }
        returnWords(curr, results);
        return results;
    }

    /**
     * This recursively searches through the Trie to build a list of Candidates
     * @param n : the Trie's root node
     * @param results: the list to return
     */

    private void returnWords(Node n, List<Candidate> results){
        if(n.isWord) results.add(new Candidate(n.word, n.weight));
        for(char c : n.children.keySet()){
            returnWords(n.children.get(c), results);
        }
    }


}
