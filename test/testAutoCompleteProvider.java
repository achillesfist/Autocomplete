import org.junit.Assert;
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
        Assert.assertEquals(results.size(), 3);
    }

    @Test
    public void testCompareCandidates(){
        Candidate moreLikely = new Candidate("the", 500);
        Candidate lessLikely = new Candidate("supercalifragilisticexpialadocious", 1);

        Assert.assertEquals(moreLikely.compareTo(lessLikely), -1);
        Assert.assertEquals(lessLikely.compareTo(moreLikely), 1);
        Assert.assertEquals(moreLikely.compareTo(moreLikely), 0);


    }


}
