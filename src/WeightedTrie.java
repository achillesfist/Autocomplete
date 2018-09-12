import java.util.HashMap;

/**
 * This Trie will keep track of all the information in the list of words the user has already typed.
 */
public class WeightedTrie {
    private TrieNode root;

    WeightedTrie(){
        root = new TrieNode(new HashMap<>(), ' ', "", false, 0);
    }

    public void learnWord(String word){
        TrieNode current = root;
        for(int i = 0; i<word.length(); i++){
            //Check if its end of word first, do stuff
            if(!current.getChildren().keySet().contains(word.charAt(i))){
                //node does not contain this letter as a child so it needs to be added to the list of children
                //create new node
//                TrieNode newNode = TrieNode();
                //
            }else{
                //node already exists, continue traversing Trie.
            }
        }
    }
}
