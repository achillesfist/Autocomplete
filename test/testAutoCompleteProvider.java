import org.junit.Test;

import java.util.HashMap;

/**
 * Created by Evelyn on 7/20/2018.
 */
public class testAutoCompleteProvider {

    @Test
    public void testTrain(){
        AutocompleteProvider acp = new AutocompleteProvider();
        acp.train("Hello, my name is Dee and I would love to work for you, I love Hello");
        acp.getCounts();

        acp.train("Hello, Dee and I are on the way to the train");
        acp.getCounts();

    }
}
