package console;

import common.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int[] inputArray = Utils.readIntArrayFromConsole("array of integer numbers");
        startProgram(inputArray);

        System.out.println("Run with an array of random numbers? [yes / no]");
        startWithRandomArray(readAnswer());
    }

    public static void printResult(String inputData, String outputData, int amountElements)
    {
        System.out.printf("{%s} -> {%s} - %d elements >= arithmetic mean of array.%n",
                inputData, outputData, amountElements);
    }

    private static void startProgram(int[] inputArray)
    {
        int[] outputArray = Logic.findElementsMoreMean(inputArray);
        int amountElements = Logic.findAmountElementsMoreMean(inputArray);

        String inputData = Utils.toString(inputArray);
        String outputData = Utils.toString(outputArray);

        printResult(inputData, outputData, amountElements);
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

