package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartyTest {

    @Test
    public void printArrayTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest(){
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\nMushrooms";
        String actual = arrayParty.lastElement(breakfast);
        Assert.assertEquals(expected, actual);

    }

    //TODO Define the method lastButOneTest
    @Test
    public void lastButOneTest() {
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\nTomatoes";
        String actual = arrayParty.lastButOne(breakfast);
        Assert.assertEquals(expected, actual);
    }

    //TODO Define the method reverseTest
    @Test
    public void reverse() {
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\nMushrooms\nTomatoes\nBacon\nBeans\nEggs\nSausage";
        String actual = arrayParty.reverse(breakfast);
        Assert.assertEquals(expected, actual);
    }

    //TODO Define the method isPalindromeTest
    @Test
    public void isPalindromeTest() {
        ArrayParty arrayParty = new ArrayParty();
        String [] palindromic = {"Sausage", "Eggs", "Beans",
                "Beans", "Eggs", "Sausage"};
        String [] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tomatoes", "Mushrooms"};
        boolean expected1 = true;
        boolean expected2 = false;
        boolean actual1 = arrayParty.isPalindrome(palindromic);
        boolean actual2 = arrayParty.isPalindrome(breakfast);
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void consecutiveDuplicatesEliminatedTest() {
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n1\n3\n2\n1\n4";
        int[] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
        String actual = arrayParty.consecutiveDuplicatesEliminated(nums);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void packTest() {
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\naaaa, b, cc, aa, d, eeee";
        char [] letters = {'a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'};
        String actual = arrayParty.pack(letters);
        Assert.assertEquals(expected, actual);
    }
}
