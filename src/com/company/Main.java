package com.company;

import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {

        //tworzę okno które będzie wyświetlać zawartość programu
        JFrame okno = new JFrame();

        //nadaję własności okna
        okno.setTitle("Krzywe Beziera");
        okno.setSize(800,600);
        okno.setLocationRelativeTo(null);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
        okno.setResizable(false);

        //tworzę panel który będzie zawartością okna
        Panel panel = new Panel();

        //podpinam panel do okna
        okno.add(panel);
    }
}