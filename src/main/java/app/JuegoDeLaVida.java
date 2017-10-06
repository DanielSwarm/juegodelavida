/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import vista.InterfazJuegoDeLaVida;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class JuegoDeLaVida {
    public static void main(String[] args) {
        InterfazJuegoDeLaVida interfaz;
        int filas=0;
        int columnas=0;
        String cFil;
        String cCol;
                do{
                    try{
                    cFil = JOptionPane.showInputDialog("Ingrese la  cantidad de filas");
                    filas = Integer.parseInt(cFil);
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "Error de ingreso");
                    }
                    if(filas > 0){
                        break;
                    }
                }while(true);
                do{
                    try{
                    cCol = JOptionPane.showInputDialog("Ingrese la cantidad de columnas");
                    columnas = Integer.parseInt(cCol);
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "Error de ingreso");
                    }
                    if(columnas > 0){
                        break;
                    }
                }while(true);
        interfaz = new InterfazJuegoDeLaVida(filas, columnas);
    }
}
