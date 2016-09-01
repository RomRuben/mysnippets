package my.snippets.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by ruben on 01/09/2016.
 */
public class StringRegexTest {

    private StringRegex stringRegex;

    @Before
    public void setUp() throws Exception {
        stringRegex = new StringRegex();
    }

    @Test
    public void buildPattern() throws Exception {
        assertTrue(stringRegex.buildPattern("[a-z]*")
                .matcher("romruben")
                .matches()
        );

        assertFalse(stringRegex.buildPattern("[a-z]*")
                .matcher("romruben4Fail")
                .matches()
        );
    }

    @Test
    public void buildMatcher() throws Exception {
        // TODO: 01/09/2016
    }

    @Test
    public void isMatchAnyDigits() throws Exception {
        // TODO: 01/09/2016
    }

    @Test
    public void isMatchNonDigit() throws Exception {
        // TODO: 01/09/2016
    }

    @Test
    public void isMatchWitheSpaceCharacter() throws Exception {
        // TODO: 01/09/2016
    }

    @Test
    public void isMatchNonWhitespaceCharacter() throws Exception {
        // TODO: 01/09/2016
    }

    @Test
    public void isMatchAnyWordCharacter() throws Exception {
        // TODO: 01/09/2016
    }

    @Test
    public void isMatchAnyNonWordCharacter() throws Exception {
        // TODO: 01/09/2016
    }

    @Test
    public void isMatchWordBoundary() throws Exception {
        // TODO: 01/09/2016
    }

    @Test
    public void isMatchNoWordBoundary() throws Exception {
        // TODO: 01/09/2016
    }

    @Test
    public void isMatchOnceOrNoAtAll() throws Exception {
        // TODO: 01/09/2016
    }

    @Test
    public void isMatchZeroOrMoreTimes() throws Exception {
        // TODO: 01/09/2016
    }

    @Test
    public void isMatchNtimes() throws Exception {
        // TODO: 01/09/2016
    }

    @Test
    public void isMatchNtimesOrMore() throws Exception {
        // TODO: 01/09/2016
    }

    @Test
    public void isMatchBetweenNandMtimes() throws Exception {
        // TODO: 01/09/2016
    }

}