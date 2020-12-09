package common;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Utils
{
    public static String toString(int[] arr)
    {
        if (arr == null)
        {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++)
        {
            if (i != 0)
            {
                stringBuilder.append(", ");
            }
            stringBuilder.append(arr[i]);
        }
        return stringBuilder.toString();
    }

    public static int[] readIntArrayFromConsole(String arrName)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter %s: ", arrName);
        String line = scanner.nextLine();
        return toIntArray(line);
    }

    public static int[] toPrimitive(Integer[] arr)
    {
        if (arr == null)
        {
            return null;
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            result[i] = arr[i];
        }
        return result;
    }

    public static int[] toIntArray(String line)
    {
        Scanner scanner = new Scanner(line);
        scanner.useLocale(Locale.ROOT);
        scanner.useDelimiter("(\\s|[,:;])+");
        System.out.println();
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext())
        {
            list.add(scanner.nextInt());
        }
        Integer[] arr = list.toArray(new Integer[0]);
        return toPrimitive(arr);
    }
}
