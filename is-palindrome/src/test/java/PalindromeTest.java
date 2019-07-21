import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class PalindromeTest {

    private Palindrome palindrome;

    @Before
    public void setUp() throws Exception {
        palindrome = new Palindrome();
    }

//    @Ignore("Remove to run test")
    @Test
    public void testEmptyStringShouldBeAPalindrome() {
        String sentence = "";

        assertTrue(palindrome.check(sentence));
    }

//    @Ignore("Remove to run test")
    @Test
    public void testSentenceShouldBeAPalindrome() {
        String sentence = "Madam Im Adam";

        assertTrue(palindrome.check(sentence));
    }

//    @Ignore("Remove to run test")
    @Test
    public void testSentenceWithSpecialCharactersShouldNotBeAPalindrome() {
        String sentence = "First ladies rule the State and state the rule: ladies first";

        assertFalse(palindrome.check(sentence));
    }

//    @Ignore("Remove to run test")
    @Test
    public void testShouldNotBeAPalindrome() {
        String sentence = "race a car";

        assertFalse(palindrome.check(sentence));
    }
}