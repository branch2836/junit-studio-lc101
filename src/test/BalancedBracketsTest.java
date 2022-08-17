package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void stringInBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void splitStringInBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bracketsAndStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void emptyStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void leftBracketWithStringReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void mismatchedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void leftBracketOnlyReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void nestedBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets( "[[]]"));
    }

    @Test
    public void openNestedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]][["));
    }



}
