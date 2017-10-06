/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.error404.juegovida;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author haice
 */
public class Configurador extends JFrame implements ActionListener{
    private Tablero tab;
    private Lateral lat;
    private int X=5;
    private int Y=5;
    
    public Configurador(){
        this.Inicializador();
    }
    public void Inicializador(){
        this.Paneles();
        setTitle("Juego de la vida");
        setSize(800, 800);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void Paneles(){
        lat = new Lateral();
        add(lat, BorderLayout.NORTH);
        
        tab = new Tablero(X,Y);
        add(tab, BorderLayout.CENTER);  
        lat.btnIniciar.addActionListener(this);
        lat.btnParar.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (this.lat.btnIniciar == e.getSource()) {
            
            
            
        }else if(lat.btnParar == e.getSource()){
//            tab.ss=false;
            
            
        }
    }
}
