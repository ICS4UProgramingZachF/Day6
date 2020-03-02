package CodeBite;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Calculator {

    /*
    * this program is a simple calculator it gets the input as a number then the user can select 4 basic math function
    * add, subtract , multiply and divide.
    */

    //this is all the objects on the pannel
    private JTextField txtOne;
    private JTextField txtTwo;
    private JButton btnadd;
    private JPanel Panel;
    private JButton btnmul;
    private JButton btnmin;
    private JButton btndiv;
    private JLabel lbl;

//global variuble
    int total;


    public Calculator() {

        //this is the add button
        btnadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                //this gets the user's input
                int readerFirst = Integer.parseInt(txtOne.getText());
                int readerSecond = Integer.parseInt(txtTwo.getText());

                //this adds the user's input as the total
               total = readerFirst + readerSecond;

               //this displays the total
               lbl.setText(Integer.toString(total));
            }
        });

        //this is the subtract button
        btnmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                //this gets the user's input
                int readerFirst = Integer.parseInt(txtOne.getText());
                int readerSecond = Integer.parseInt(txtTwo.getText());

                //this subtracts the user's input as the total
                total = readerFirst - readerSecond;

                //this displays the total
                lbl.setText(Integer.toString(total));
            }
        });

        //this is the multiply button
        btnmul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                //this gets the user's input
                int readerFirst = Integer.parseInt(txtOne.getText());
                int readerSecond = Integer.parseInt(txtTwo.getText());

                //this multiplys the user's input as the total
                total = readerFirst * readerSecond;

                //this displays the total
                lbl.setText(Integer.toString(total));
            }
        });

        //this is the button that divides
        btndiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                //this gets the user's input
                int readerFirst = Integer.parseInt(txtOne.getText());
                int readerSecond = Integer.parseInt(txtTwo.getText());

                //this adds the user's input as the total
                total = readerFirst / readerSecond;

                //this displays the total
                lbl.setText(Integer.toString(total));
            }
        });
    }

    public  static void main(String[] args){
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
