package console;

import common.*;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int[] sourceArray = Utils.readIntArrayFromConsole("array of integer numbers");
        startProgram(sourceArray);

        System.out.println("Run with an array of random numbers? [yes / no]");
        startWithRandomArray(readAnswer());
    }

    public static void printResult(String sourceSequence, String finalSequence, int amountElements)
    {
        System.out.printf("{%s} -> {%s} - %d elements >= arithmetic mean of array.%n",
                sourceSequence, finalSequence, amountElements);
    }

    private static void startProgram(int[] sourceArray)
    {
        int[] finalArray = Logic.findElementsMoreMean(sourceArray);
        int amountElements = Logic.findAmountElementsMoreMean(sourceArray);

        String stringSourceArray = Utils.toString(sourceArray);
        String stringFinalArray = Utils.toString(finalArray);

        printResult(stringSourceArray, stringFinalArray, amountElements);
    }

    private static String readAnswer()
    {
        Scanner scn = new Scanner(System.in);
        return scn.next();
    }

    private static void startWithRandomArray(String answer)
    {
        if (answer.equalsIgnoreCase("yes"))
        {
            int[] randomArray = Utils.createRandomIntArray();
            startProgram(randomArray);
        }
        else if (answer.equalsIgnoreCase("no"))
        {
            return;
        }
        else
        {
            System.err.print("You did not enter an answer [yes/no]");
        }
    }
}

