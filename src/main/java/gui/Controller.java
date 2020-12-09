package gui;
import common.Utils;

import javax.swing.*;

public class Controller
{
    private Model model;

    public Controller(Model model)
    {
        this.model = model;
    }

    public void setInputDataInModel(String inputData)
    {
        int[] inputArray = Utils.toIntArray(inputData);
        model.setInputArray(inputArray);
    }

    public String getOutputDataFromModel()
    {
        int[] outputArray = model.getOutputArray();
        return Utils.toString(outputArray);
    }

    public String getAmountElementsFromModel()
    {
        return String.valueOf(model.getAmountElementsMoreMean());
    }

    public void start()
    {
        model.startFinding();
    }
}
