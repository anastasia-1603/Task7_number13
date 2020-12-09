package gui; //исходная версия в MyDemo Logic

import javax.swing.*;
import common.Utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame
{
     private Controller controller;
     private JPanel panel;
     private JPanel panelButtons;
     private JTextField inputDataField;
     private JTextField outputDataField;
     private JButton executeButton;
     private JButton randomButton;
     private JLabel inputTextLabel;
     private JLabel outputTextLabel;
     private JLabel resultLabel;

     public Frame(Controller controller)
     {
          super("Calculations");
          this.controller = controller;
          panel = new JPanel();
          panelButtons = new JPanel();
          executeButton = new JButton("Calculate");
          randomButton = new JButton("Fill with random");
          inputTextLabel = new JLabel("Enter an array of integers.");
          outputTextLabel = new JLabel("Output");
          outputDataField = new JTextField();
          inputDataField = new JTextField();
          resultLabel = new JLabel(" ");


          executeButton.addActionListener(new ActionListener()
          {
               @Override
               public void actionPerformed(ActionEvent e)
               {
                    go();
                    this.pack();
               }
          });

        /*  randomButton.addActionListener(new ActionListener()
          {
               @Override
               public void actionPerformed(ActionEvent e)
               {
                    fillRandom();
               }
          });*/

          panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
          panel.add(inputTextLabel);
          panel.add(inputDataField);
        //  panelButtons.add(executeButton);
         // panelButtons.add(randomButton);
          panel.add(executeButton);
          panel.add(randomButton);
          panel.add(panelButtons);
          panel.add(outputTextLabel);
          panel.add(outputDataField);
          panel.add(resultLabel);

          this.setContentPane(panel);
          initFrame();

     }

     public JTextField getInputDataField()
     {
          return inputDataField;
     }

     public void setOutputData(String outputData)
     {
          this.outputDataField.setText(outputData);
     }

     public void setResultText(String resultText)
     {
          this.resultLabel.setText(resultText);
     }

     private void initFrame()
     {
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setLocationRelativeTo(null);
          this.pack();
          this.setVisible(true);
     }

     public void go()
     {
          String inputData = inputDataField.getText();
          controller.setInputDataInModel(inputData);
          controller.start();
          String outputData = controller.getOutputDataFromModel();
          outputDataField.setText(outputData);
          String amountElements = controller.getAmountElementsFromModel();
          String resultText = amountElements + " elements greater than or equal to the arithmetic mean of array elements";
          resultLabel.setText(resultText);
     }

    /* private void fillRandom()
     {
          int sizeArray = (int) (Math.random() * 15);
          int[] arrayRandom = new int[sizeArray];
          for(int i = 0; i < sizeArray; i++)
          {
               arrayRandom[i] = (int) (Math.random() * 1000) - 500;
          }
          String stringRandomNum = Utils.toString(arrayRandom);
          inputDataField.setText(stringRandomNum);
     }*/


}
