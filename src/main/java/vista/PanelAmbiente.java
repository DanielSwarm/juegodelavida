/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 *
 * @author daniel
 */
public class PanelAmbiente extends JPanel {
    public Celula[][] celulas;
    public int columnas;
    public int filas;
    
     public PanelAmbiente(InterfazJuegoDeLaVida v, int x, int y){
        InterfazJuegoDeLaVida ventana = v;
        this.filas = x;
        this.columnas = y;
        this.celulas = new Celula[x][y];
        this.inicializarComponentes();
    }
     
    public void inicializarComponentes() {
        this.setLayout(new GridLayout(this.filas, this.columnas));
        TitledBorder border = BorderFactory.createTitledBorder("Tablero");
        border.setTitleColor(Color.BLUE);
        setBorder(border);
        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columnas; j++) {
                this.celulas[i][j] = new Celula();
                int numero = (int) (Math.random() * 100) + 1;
                if(numero <= 90){
                    this.celulas[i][j].setVida(false);
                }
                add(this.celulas[i][j]);
            }
        }

    }
    
    public void revivir(int i, int j){
        this.celulas[i][j].setVida(true);
    }
    public void matar(int i, int j){
        this.celulas[i][j].setVida(false);
    }
    
}
