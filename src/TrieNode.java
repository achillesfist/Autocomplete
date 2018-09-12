import java.util.HashMap;

/**
 * This represents a Node of a weighted Trie which will represent the words the user has already typed.
 * Each Node will store its children, what "word" the current node represents, whether or not its the end of the word
 * and the weight that word has.
 */
public class TrieNode {
    private HashMap<Character, TrieNode> children;
    private char letter;
    private String word;
    private boolean isEndOfWord;
    private int weight;

    TrieNode(HashMap<Character, TrieNode> children,char letter, String word, boolean isEndOfWord, int weight){
        this.children = children;
        this.letter = letter;
        this.word = word;
        this.isEndOfWord = isEndOfWord;
        this.weight = weight;
    }

    public HashMap<Character,TrieNode> getChildren(){
        return children;
    }

    public String getWord() {
        return word;
    }

    public boolean isEndOfWord() {
        return isEndOfWord;
    }

    public int getWeight() {return weight; }
}
