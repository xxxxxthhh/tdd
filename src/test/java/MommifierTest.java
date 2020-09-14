import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {
    @Test
    void should_return_True_if_vowelRate_moreThan_30() {
        Mommifier mommifier = new Mommifier();
        String s = "Keep";
        Boolean if_satisfy = mommifier.vowelRateSatisfiy(s);
        assertEquals(true, if_satisfy);
    }
}
