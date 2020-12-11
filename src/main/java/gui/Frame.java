package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame
{
     private Controller controller;
     private JPanel panel;
     private JTextField inputDataField;
     private JButton buttonExecute;
     private JButton buttonRandom;
     private JButton buttonDelete;
     private JLabel inputTextLabel;
     private JLabel outputTextLabel;

     public Frame(Controller controller, View view)
     {
          super("Calculations");

          this.controller = controller;

          panel = new JPanel();
          buttonExecute = new JButton("Execute");
          buttonRandom = new JButton("Fill with random");
          inputTextLabel = new JLabel("Enter an array of integers.");
          outputTextLabel = new JLabel("Result");
          inputDataField = new JTextField();
          buttonDelete = new JButton("Delete");

          addActionToButtons();
          addComponentsToPanel(view);
          initFrame(panel);
     }

     private void addActionToButtons()
     {
          buttonExecute.addActionListener(new ActionListener()
          {
               @Override
               public void actionPerformed(ActionEvent e)
               {
                    controller.onButtonExecute(inputDataField.getText());
               }
          });

          buttonRandom.addActionListener(new ActionListener()
          {
               @Override
               public void actionPerformed(ActionEvent e)
               {
                    controller.onButtonRandom(inputDataField);
               }
          });

          buttonDelete.addActionListener(new ActionListener()
          {
               @Override
               public void actionPerformed(ActionEvent e)
               {
                    controller.onButtonDelete(inputDataField);
               }
          });
     }

     private void addComponentsToPanel(View view)
     {
          panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
          panel.add(inputTextLabel);
          panel.add(inputDataField);
          panel.add(buttonExecute);
          panel.add(buttonRandom);
          panel.add(buttonDelete);
          panel.add(outputTextLabel);
          view.addComponents(panel);
     }

     private void initFrame(JPanel panel)
     {
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setBounds(0, 0, 500, 200);
          this.setContentPane(panel);
          this.setVisible(true);
     }
}
