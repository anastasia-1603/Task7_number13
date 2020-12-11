package gui;

import common.Logic;

public class Model
{
    private int[] inputArray;
    private int amountElements;
    private int[] outputArray;

    public void setInputArray(int[] inputArray)
    {
        this.inputArray = inputArray;
    }

    public void calcAmountElements()
    {
       amountElements = Logic.findAmountElementsMoreMean(inputArray);
    }

    public void calcOutputArray()
    {
        outputArray = Logic.findElementsMoreMean(inputArray);
    }

    public void startCalculation()
    {
        calcOutputArray();
        calcAmountElements();
    }

    public int[] getOutputArray() {
        return outputArray;
    }

    public int getAmountElements() {
        return amountElements;
    }
}
