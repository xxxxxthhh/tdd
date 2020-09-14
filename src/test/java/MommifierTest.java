import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {
    @Test
    void should_return_True_if_vowelRate_moreThan_30() {
        Mommifier mommifier = new Mommifier();
        String s1 = "Keep";
        String s2 = "yyyyyyyaeeebbbbb";
        Boolean if_satisfy1 = mommifier.vowelRateSatisfiy(s1);
        Boolean if_satisfy2 = mommifier.vowelRateSatisfiy(s2);
        assertEquals(true, if_satisfy1);
        assertEquals(false, if_satisfy2);
    }

    @Test
    void if_vowelRate_moreThan_30_then_insert() {
        Mommifier mommifier = new Mommifier();
        String s1 = "Keep";
        String s2 = "Kepe";
        String s3 = "aaaabb";
        String mofiS1 = mommifier.insertMommy(s1);
        String mofiS2 = mommifier.insertMommy(s2);
        String mofiS3 = mommifier.insertMommy(s3);
        assertEquals(mofiS1,"Kemommyep");
        assertEquals(mofiS2, s2);
        assertEquals(mofiS3, "amommyamommyamommyabb");
    }
}
