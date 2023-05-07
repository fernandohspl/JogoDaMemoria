package com.mycompany.QuebraCabeca;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author fernando.lima
 */

 

public class QuebraCabeca extends JFrame implements ActionListener {
    JButton botao1, botao2, botao3, botao4;
   
    public QuebraCabeca() {
        super("Quebra-Cabeça");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        botao1 = new JButton("1");
        botao2 = new JButton("2");
        botao3 = new JButton("3");
        botao4 = new JButton("4");
       
        botao1.addActionListener(this);
        botao2.addActionListener(this);
        botao3.addActionListener(this);
        botao4.addActionListener(this);
       
        setLayout(new GridLayout(2, 2));
        add(botao1);
        add(botao2);
        add(botao3);
        add(botao4);
       
        setVisible(true);
    }
   
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == botao1) {
            // código para mover a peça 1
        } else if (source == botao2) {
            // código para mover a peça 2
        } else if (source == botao3) {
            // código para mover a peça 3
        } else if (source == botao4) {
            // código para mover a peça 4
        }
    }
   
    public static void main(String[] args) {
        new QuebraCabeca();
    }
}


