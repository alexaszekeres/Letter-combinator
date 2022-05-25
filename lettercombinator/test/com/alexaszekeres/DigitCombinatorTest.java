package com.alexaszekeres;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DigitCombinatorTest {

    @Test
    void testWithTwoDigits() {
        List<String> result = Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf");
        List<String> actual = DigitCombinator.getPossibleLetterCombinationsOfDigits("23");
        assertLinesMatch(result, actual);
    }

    @Test
    void testWith1Digit() {
        List<String> result = Arrays.asList("a","b","c");
        List<String> actual = DigitCombinator.getPossibleLetterCombinationsOfDigits("2");
        assertLinesMatch(result, actual);
    }

    @Test
    void testWith4Digits(){
        List<String> result = Arrays.asList("adpa", "adpb", "adpc", "adqa", "adqb", "adqc", "adra", "adrb", "adrc", "adsa", "adsb", "adsc", "aepa", "aepb", "aepc", "aeqa", "aeqb", "aeqc", "aera", "aerb", "aerc", "aesa", "aesb", "aesc", "afpa", "afpb", "afpc", "afqa", "afqb", "afqc", "afra", "afrb", "afrc", "afsa", "afsb", "afsc", "bdpa", "bdpb", "bdpc", "bdqa", "bdqb", "bdqc", "bdra", "bdrb", "bdrc", "bdsa", "bdsb", "bdsc", "bepa", "bepb", "bepc", "beqa", "beqb", "beqc", "bera", "berb", "berc", "besa", "besb", "besc", "bfpa", "bfpb", "bfpc", "bfqa", "bfqb", "bfqc", "bfra", "bfrb", "bfrc", "bfsa", "bfsb", "bfsc", "cdpa", "cdpb", "cdpc", "cdqa", "cdqb", "cdqc", "cdra", "cdrb", "cdrc", "cdsa", "cdsb", "cdsc", "cepa", "cepb", "cepc", "ceqa", "ceqb", "ceqc", "cera", "cerb", "cerc", "cesa", "cesb", "cesc", "cfpa", "cfpb", "cfpc", "cfqa", "cfqb", "cfqc", "cfra", "cfrb", "cfrc", "cfsa", "cfsb", "cfsc");
        List<String> actual = DigitCombinator.getPossibleLetterCombinationsOfDigits("2372");
        assertLinesMatch(result, actual);
    }

    @Test
    void testWithZeroDigits(){
        List<String> result = Arrays.asList("");
        List<String> actual = DigitCombinator.getPossibleLetterCombinationsOfDigits("");
        assertLinesMatch(result, actual);
    }

    @Test
    void testWithDigitsOutOfBounds(){
        List<String> result = new ArrayList<>();
        List<String> actual = DigitCombinator.getPossibleLetterCombinationsOfDigits("19");
        assertLinesMatch(result, actual);
    }
}