package common;

import java.util.ArrayList;
import java.util.List;

public class Logic
{
    public static int[] findElementsMoreMean(int[] arr)
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

    public static int findAmountElementsMoreMean(int[] arr)
    {
        return findElementsMoreMean(arr).length;
    }

    private static double findArithmeticMean(int[] arr)
    {
        double sum = 0;
        for (int j : arr)
        {
            sum += j;
        }
        return sum / arr.length;
    }

    private static int findMinElement(int[] array)
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
    }
}
