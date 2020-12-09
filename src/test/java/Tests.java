
import org.junit.Assert;
import org.junit.Test;
import common.Logic;

public class Tests
{
    @Test
    public void test1()
    {
        int[] array = {};
        int result = Logic.findElementsMoreMean(array).length;
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test2()
    {
        int[] array = {0};
        int result = Logic.findElementsMoreMean(array).length;
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test3()
    {
        int[] array = {1, 1, 1, 1, 1};
        int result = Logic.findElementsMoreMean(array).length;
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test4()
    {
        int[] array = {1000, 4, -765, 0, 11};
        int result = Logic.findElementsMoreMean(array).length;
        int expectedResult = 1;
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test5()
    {
        int[] array = {-1, -2, -1090, -76, -99, -5050, -39, -3};
        int result = Logic.findElementsMoreMean(array).length;
        int expectedResult = 6;
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test6()
    {
        int[] array = {12};
        int result = Logic.findElementsMoreMean(array).length;
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test7()
    {
        int[] array = {1, -1, 1, -1};
        int result = Logic.findElementsMoreMean(array).length;
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test8()
    {
        int[] array = {9, 8, 7, 46, 5};
        int result = Logic.findElementsMoreMean(array).length;
        int expectedResult = 1;
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test9()
    {
        int[] array = {101010, 202020, 606060, 4, 25025};
        int result = Logic.findElementsMoreMean(array).length;
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test10()
    {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8 ,9};
        int result = Logic.findElementsMoreMean(array).length;
        int expectedResult = 5;
        Assert.assertEquals(expectedResult, result);
    }
}
