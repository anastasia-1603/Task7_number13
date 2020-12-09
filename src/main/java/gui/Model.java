package gui;
import common.Logic;
public class Model
{
    private int[] inputArray;
    private int amountElementsMoreMean;
    private int[] outputArray;

    public void setInputArray(int[] inputArray)
    {
        this.inputArray = inputArray;
    }

    public void findAmountElements()
    {
        this.amountElementsMoreMean = Logic.findAmountElementsMoreMean(this.inputArray);
    }

    public void findOutputArray()
    {
        this.outputArray = Logic.findElementsMoreMean(this.inputArray);
    }

    public void startFinding()
    {
        findOutputArray();
        findAmountElements();
    }

    public int[] getOutputArray() {
        return outputArray;
    }

    public int getAmountElementsMoreMean() {
        return amountElementsMoreMean;
    }
}
