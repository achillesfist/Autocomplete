import java.util.HashMap;

/**
 * This represents a Node of a weighted Trie which will represent the words the user has already typed.
 */
public class Node {
    /** fragment represents the fragment so far up to this Node */
    public String fragment;
    /** children stores all the child Nodes of this Node */
    public HashMap<Character, Node> children;
    /** isWord represents if this Node is the end of a Word */
    public boolean isWord;
    /** weight stores the amount of times this fragment has been typed, if it is a fragment. */
    public int weight;

    public Node(String character){
        fragment = character;
        this.children = new HashMap<>();
        isWord = false;
        weight = 0;
    }
}
