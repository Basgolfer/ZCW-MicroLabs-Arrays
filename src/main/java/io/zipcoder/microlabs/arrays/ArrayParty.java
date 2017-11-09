package io.zipcoder.microlabs.arrays;


public class ArrayParty {

    public String printArray(String[] inputArray){
        String output = "*** Output ***";
        for(String string : inputArray) {
            output = output + "\n" + string;
        }
        return output;
    }

    public String lastElement(String[] inputArray){
        int lengthOfInputArray = inputArray.length;
        String output = "*** Output ***";
        output = output + "\n" + inputArray[lengthOfInputArray - 1];
        return output;
    }

    //TODO Define the method lastButOne
    public String lastButOne(String[] inputArray) {
        int lengthOfInputArray = inputArray.length;
        String output = "*** Output ***";
        output = output + "\n" + inputArray[lengthOfInputArray-2];
        return output;
    }

    //TODO Define the method reverse
    public String reverse(String[] inputArray) {
        String output = "*** Output ***";
        for (int i = inputArray.length - 1; i >= 0; i--) {
            output = output + "\n" + inputArray[i];
        }
        return output;
    }

    //TODO Define the method isPalindrome
    public Boolean isPalindrome(String[] inputArray) {
        boolean bool = false;

        int backwardsCounter = inputArray.length - 1;

        for(int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].equals(inputArray[backwardsCounter])) {
                bool = true;
                backwardsCounter--;
            }
            else {
                bool = false;
                break;
            }
        }
        return bool;
    }

    public String consecutiveDuplicatesEliminated(int[] inputArray) {
        String output = "*** Output ***";
        Integer lastNumber = -100;
        for (int i = 0; i < inputArray.length; i++) {
            if (lastNumber != inputArray[i]) {
                output = output + "\n" + inputArray[i];
            }
            lastNumber = inputArray[i];
        }
        return output;
    }

    public String pack (char[] inputArray) {
        String output = "*** Output ***\n";
        Character lastCharacter = null;
        for (int i = 0; i < inputArray.length; i++) {
            //First iteration of the loop it will always add the first character
            if (i == 0) {
                output += inputArray[i];
            }
            else if (lastCharacter == inputArray[i]) {
                output += inputArray[i];
            }
            else if (lastCharacter != inputArray[i]) {
                output += ", " + inputArray[i];
            }
            lastCharacter = inputArray[i];
        }
        return output;
    }




}
