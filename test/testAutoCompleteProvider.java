import org.junit.Test;

import java.util.List;

/**
 * Created by Evelyn on 7/20/2018.
 */
public class testAutoCompleteProvider {

    @Test
    public void testTrain(){
        AutocompleteProvider acp = new AutocompleteProvider();
        acp.train("Hello, my name is Dee and I would love to work for you, I love Hello");
        acp.train("hola, the weather is hazy and humid today and I love it");
        List<Candidate> results = acp.getWords("d");
        for(Candidate c : results){
            System.out.println(c);
        }

    }
}
