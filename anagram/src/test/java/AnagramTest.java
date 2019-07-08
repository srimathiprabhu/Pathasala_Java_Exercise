import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import anagramPackage.Anagram;

public class AnagramTest {


    @Test
    public void testNoMatches() {
        Anagram detector = new Anagram("diaper");
        assertTrue(detector.match(Arrays.asList("hello", "world", "zombies", "pants")).isEmpty());
    }

//    @Ignore("Remove to run test")
    @Test
    public void testDetectMultipleAnagrams() {
        Anagram detector = new Anagram("master");
        List<String> anagrams = detector.match(Arrays.asList("stream", "pigeon", "maters"));
        assertTrue(anagrams.contains("maters") && anagrams.contains("stream"));
    }

//    @Ignore("Remove to run test")
    @Test
    public void testEliminateAnagramSubsets() {
        Anagram detector = new Anagram("good");
        assertTrue(detector.match(Arrays.asList("dog", "goody")).isEmpty());
    }

//    @Ignore("Remove to run test")
    @Test
    public void testDetectLongerAnagram() {
        Anagram detector = new Anagram("listen");
        List<String> anagrams = detector.match(Arrays.asList("enlists", "google", "inlets", "banana"));
        assertTrue(anagrams.contains("inlets"));
    }

//    @Ignore("Remove to run test")
    @Test
    public void testDetectMultipleAnagramsForLongerWord() {
        Anagram detector = new Anagram("allergy");
        List<String> anagrams = detector.match(Arrays.asList("gallery", "ballerina",
                                                             "regally", "clergy",
                                                             "largely", "leading"));
        assertTrue(anagrams.contains("gallery") && anagrams.contains("regally") && anagrams.contains(("largely")));
    }

//    @Ignore("Remove to run test")
    @Test
    public void testEliminateAnagramsWithSameChecksum() {
        Anagram detector = new Anagram("mass");
        assertTrue(detector.match(Collections.singletonList("last")).isEmpty());
    }

//    @Ignore("Remove to run test")
    @Test
    public void testCaseInsensitiveWhenBothAnagramAndSubjectStartWithUpperCaseLetter() {
        Anagram detector = new Anagram("Orchestra");
        List<String> anagrams = detector.match(Arrays.asList("cashregister", "Carthorse", "radishes"));
        assertTrue(anagrams.contains("Carthorse"));
    }

//    @Ignore("Remove to run test")
    @Test
    public void testCaseInsensitiveWhenSubjectStartsWithUpperCaseLetter() {
        Anagram detector = new Anagram("Orchestra");
        List<String> anagrams = detector.match(Arrays.asList("cashregister", "carthorse", "radishes"));
        assertTrue(anagrams.contains("carthorse"));
    }

//    @Ignore("Remove to run test")
    @Test
    public void testCaseInsensitiveWhenAnagramStartsWithUpperCaseLetter() {
        Anagram detector = new Anagram("orchestra");
        List<String> anagrams = detector.match(Arrays.asList("cashregister", "Carthorse", "radishes"));
        assertTrue(anagrams.contains("Carthorse"));
    }

//    @Ignore("Remove to run test")
    @Test
    public void testIdenticalWordRepeatedIsNotAnagram() {
        Anagram detector = new Anagram("go");
        assertTrue(detector.match(Collections.singletonList("go Go GO")).isEmpty());
    }

//    @Ignore("Remove to run test")
    @Test
    public void testAnagramMustUseAllLettersExactlyOnce() {
        Anagram detector = new Anagram("tapper");
        assertTrue(detector.match(Collections.singletonList("patter")).isEmpty());
    }

//    @Ignore("Remove to run test")
    @Test
    public void testWordsAreNotAnagramsOfThemselvesCaseInsensitive() {
        Anagram detector = new Anagram("BANANA");
        assertTrue(detector.match(Arrays.asList("BANANA", "Banana", "banana")).isEmpty());
    }

}
