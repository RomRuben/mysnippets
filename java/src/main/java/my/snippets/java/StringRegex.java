package my.snippets.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ruben on 01/09/2016.
 */
public class StringRegex {

    public Pattern buildPattern(String regex) {
        return Pattern.compile(regex);
    }

    public Matcher buildMatcher(String regex, String matcher) {
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(matcher);
    }

    //[0-9]
    public boolean isMatchAnyDigits(String content) {
        return Pattern.matches("\\d", content);
    }

    //[^0-9]
    public boolean isMatchNonDigit(String content) {
        return Pattern.matches("\\D", content);
    }

    //[\t\n\x0B\f\r]
    public boolean isMatchWitheSpaceCharacter(String content) {
        return Pattern.matches("\\s", content);
    }

    //[^\s]
    public boolean isMatchNonWhitespaceCharacter(String content) {
        return Pattern.matches("\\S", content);
    }

    //[a-zA-Z_0-9]
    public boolean isMatchAnyWordCharacter(String content) {
        return Pattern.matches("\\w", content);
    }

    //[^\w]
    public boolean isMatchAnyNonWordCharacter(String content) {
        return Pattern.matches("\\W", content);
    }

    public boolean isMatchWordBoundary(String content) {
        return Pattern.matches("\\b", content);
    }

    public boolean isMatchNoWordBoundary(String content) {
        return Pattern.matches("\\B", content);
    }

    //x?
    public boolean isMatchOnceOrNoAtAll(String content, String target) {
        return Pattern.matches(target + "?", content);
    }

    //x*
    public boolean isMatchZeroOrMoreTimes(String content, String target) {
        return Pattern.matches(target + "*", content);
    }

    //X{n}
    public boolean isMatchNtimes(String content, String target, int times) {
        return Pattern.matches(target + "{" + times + "}", content);
    }

    //X{n,}
    public boolean isMatchNtimesOrMore(String content, String target, int min) {
        return Pattern.matches(target + "{" + min + ",}", content);
    }

    public boolean isMatchBetweenNandMtimes(String content, String target, int min, int max) {
        return Pattern.matches(target + "{" + min + "," + max + "}", content);
    }

}
