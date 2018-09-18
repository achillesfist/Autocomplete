import org.junit.Test;

import java.util.List;

/**
 * Unit tests for AutoCompleteProvider
 */
public class testAutoCompleteProvider {

    @Test
    public void testTrain(){
        AutocompleteProvider acp = new AutocompleteProvider();
        acp.train("Hello, my name is Dee and I would love to work for you");
        acp.train("hola, the weather is hazy and humid today and I love it");
        acp.train("isle island is");
        acp.train("humidity weathering hazily hell cheese cheeseburger cheesy cheese cheese cheesy cheez");
        List<Candidate> results = acp.getWords("chees");
        for(Candidate c : results){
            System.out.println(c);
        }

        //todo: SORT CANDIDATE RESULTS BY WEIGHT

        //TODO: Add actually interesting heuristics to weight

    }
}
