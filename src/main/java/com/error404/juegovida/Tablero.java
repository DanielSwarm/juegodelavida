/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.error404.juegovida;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 *
 * @author haice
 */
public class Tablero extends JPanel{
    private int X;
    private int Y;
    private JButton btn;
    private int numero;
    private int[][] Mallita;
    
    public Tablero(int alto, int ancho){
        X = ancho;
        Y = alto;
        Mallita = new int[X][Y];
        IniciarComponentes();
        
    }
    public void IniciarComponentes(){ 
       MallaCargar();
       MallaMostrar();
       MallaVida();
       TitledBorder border = BorderFactory.createTitledBorder( "Tablero" );
       border.setTitleColor( Color.BLACK );
       setBorder( border );
    }
    public void MallaMostrar(){
        GridLayout distribucion = new GridLayout(X, Y);
        setLayout(distribucion);
        
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                if (Mallita[i][j]>0) {
                    add(btn = new JButton());
                    btn.setEnabled(false);
                    btn.setBackground(java.awt.Color.yellow);
                    
                }else{
                    add(btn = new JButton());
                    btn.setEnabled(false);
                    btn.setBackground(java.awt.Color.RED);
                    
                }
            }
        }
        
    }
    public void MallaCargar(){
        
       
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                numero = (int) (Math.random()*3);
//                System.out.print(numero);
                this.Mallita[i][j] = numero;
            }
        }
        
    }
    public void MallaVida(){
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                if ((i == 0 && j==0)||(i==X-1 && j==Y-1)||(i==X-1 && j==0)||(j==Y-1 && i==0)) {
                    System.out.println("esquina"+i+","+j);
                }else if((i==0 && j>0&&j<Y)||(i==X && j>0&&j<Y)||(j==0 && i>0&&i<X)||(j==Y && i>0&&i<X)){
                        System.out.println("Pared"+i+","+j);
                    }else{
                        for (int k = i-1; k < i+1; k++) {
                            for (int l = j-1; l < j+1; l++) {
                                int contM=0;
                                int contV=0;
                                if (Mallita[k][l]>0) {
                                    contV=+1;
                                }else{
                                    contM=+1;
                                }
                                if(contV>3){
                                    Mallita[i][j]=0;
                                    System.out.println("muere");
                                }else{
                                    Mallita[i][j]=1;
                                    System.out.println("vive");
                                }
                            }
                        }
                    }
                
            }
            
        }
    }
    
    
}
