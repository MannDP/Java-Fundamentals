package edu.foundations;

import javax.swing.*;

public class WindowObject {
    public static void main(String[] args) {

        //creating our window
        JFrame windowScreen = new JFrame();
        windowScreen.setTitle("Running statistics");
        windowScreen.setSize(400, 250);
        windowScreen.setVisible(true);

        //created label object
        JLabel label = new JLabel();
        label.setText("My Label");

        windowScreen.add(label);
    }
}
