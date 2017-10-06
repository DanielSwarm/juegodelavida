/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import app.SeleccionNatural;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author daniel
 */
public class InterfazJuegoDeLaVida extends JFrame {
    private boolean esVisible = true;
    private boolean esDimensionable = true;
    public int filas;
    public int columnas;
    private int ancho = 600;
    private int alto = 600;
    private PanelOpciones panelOpciones;
    public PanelAmbiente panelAmbiente;
    public SeleccionNatural seleccion;
    
    public InterfazJuegoDeLaVida (int filas, int columnas){
        this.filas = filas;
        this.columnas = columnas;
                
        setTitle("Juego de la vida");
        setResizable(this.esDimensionable);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setVisible(this.esVisible);
        
        this.panelOpciones = new PanelOpciones(this);
        add(this.panelOpciones, BorderLayout.NORTH);
        this.panelAmbiente = new PanelAmbiente(this,this.filas, this.columnas);
        add(this.panelAmbiente, BorderLayout.CENTER);
        setSize(this.ancho, this.alto);
        
    }
    
    public void ComenzarJuego(){
        this.seleccion = new SeleccionNatural(this);
        this.seleccion.start();
    }
    public void TerminarJuego(){
        this.seleccion.setFuncionando(false);
    }
    
    
    
}
