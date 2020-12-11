package gui;

import javax.swing.*;

public class View
{
    JTextField outputDataField = new JTextField();
    JLabel resultLabel = new JLabel();

    public void setOutputData(String outputData)
    {
        this.outputDataField.setText(outputData);
    }

    public void setResultText(String text)
    {
        this.resultLabel.setText(text);
    }

    public void addComponents(JPanel panel)
    {
         panel.add(outputDataField);
         panel.add(resultLabel);
    }
}
