/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.error404.juegovida;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 *
 * @author haice
 */
class Lateral extends JPanel {
    public JButton btnIniciar;
    public JButton btnParar;
    private JLabel X;
    private JLabel Y;
    private JTextField TxtX;
    private JTextField TxtY;
    public int num1;
    public int num2;
    
    public Lateral(){
        IniciarComponentes();
    }
    public void IniciarComponentes(){
        
       TitledBorder border = BorderFactory.createTitledBorder( "comandos" );
       border.setTitleColor( Color.BLACK );
       setBorder( border );
       Panel();
    }
    public void Panel(){
        BoxLayout distribucion = new BoxLayout(this, BoxLayout.X_AXIS);
        setLayout(distribucion);
        
        add(X= new JLabel("Alto"));
        add(TxtX = new JTextField());
        add(Y= new JLabel("Ancho"));
        add(TxtY = new JTextField());          
        add(btnIniciar = new JButton("Iniciar"));
        add(btnParar = new JButton("Parar"));
//        num1 = Integer.parseInt(TxtX.getText());
//        num2 = Integer.parseInt(TxtY.getText());
    }
    
    
    
}
