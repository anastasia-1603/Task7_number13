package gui;

import common.Utils;
import javax.swing.*;

public class Controller
{
    private Model model;
    private View view;

    public Controller(Model model, View view)
    {
        this.model = model;
        this.view = view;
    }

    public void onButtonExecute(String inputData)
    {
        try
        {
            int[] inputArray = Utils.toIntArray(inputData);
            model.setInputArray(inputArray);
        }
        catch (Exception e)
        {
            view.setOutputData("Error!");
        }
        model.startCalculation();
        String outputData = Utils.toString(model.getOutputArray());
        String amountElements = String.valueOf(model.getAmountElements());
        view.setOutputData(outputData);
        view.setResultText(amountElements + " elements >= arithmetic mean of array");
    }

    public void onButtonRandom(JTextField inputDataField)
    {
        int[] randomArray = Utils.createRandomIntArray();
        String inputData = Utils.toString(randomArray);
        inputDataField.setText(inputData);
    }

    public void onButtonDelete(JTextField inputDataField)
    {
        inputDataField.setText("");
        view.setOutputData("");
        view.setResultText("");
    }
}
