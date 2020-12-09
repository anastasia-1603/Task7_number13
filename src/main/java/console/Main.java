package console;

import common.*;

public class Main
{
    public static void main(String[] args)
    {
        int[] sourceArray = Utils.readIntArrayFromConsole("array of integer numbers");
        int[] finalArray = Logic.findElementsMoreMean(sourceArray);
        int amountElements = Logic.findAmountElementsMoreMean(sourceArray);
        String stringSourceArray = Utils.toString(sourceArray);
        String stringFinalArray = Utils.toString(finalArray);
        printResult(stringSourceArray, stringFinalArray, amountElements);
    }

    public static void printResult(String sourceSequence, String finalSequence, int amountElements)
    {
        System.out.printf("{%s} -> {%s} - %d elements greater than or equal to the arithmetic mean of array elements\n",
                sourceSequence, finalSequence, amountElements);
    }

   /* public static double findArithmeticMean(int[] arr)
    {
        double sum = 0;
        for (int j : arr)
        {
            sum += j;
        }
        return sum / arr.length;
    }

    public static int[] findElementsMoreArithmeticMean(int[] arr)
    {
        List<Integer> list = new ArrayList<>();
        for (int j : arr)
        {
            if (j >= findArithmeticMean(arr) && j != findMinElement(arr))
            {
                list.add(j);
            }
        }
        Integer[] array = list.toArray(new Integer[0]);
        return Utils.toPrimitive(array);
    }

    public static int findMinElement(int[] array)
    {
        int min = array[0];
        for (int j : array)
        {
            if (j < min)
            {
                min = j;
            }
        }
        return min;
    }*/


}

