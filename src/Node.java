import java.util.HashMap;

/**
 * This represents a Node of a weighted Trie which will represent the words the user has already typed.
 * - word represents the word so far up to this Node
 * - children stores all the child Nodes of this Node
 * - isWord represents if this Node is the end of a Word
 * - weight stores the amount of times this word has been typed, if it is a word.
 */
public class Node {
    public String word;
    public HashMap<Character, Node> children;
    public boolean isWord;
    public int weight;

    public Node(String character){
        word = character;
        this.children = new HashMap<>();
        isWord = false;
        weight = 0;
    }


    public HashMap<Character, Node> getChildren(){
        return children;
    }

    public String getWord() {
        return word;
    }


    public int getWeight() {return weight; }


}
