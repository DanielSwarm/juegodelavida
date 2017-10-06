/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author daniel
 */
public class Celula extends JButton{
    private boolean vida;
    public Celula(){
        this.setBackground(Color.GREEN);
        this.setEnabled(false);
        this.vida = true;
    }
    public boolean getVida(){
        return this.vida;
    }
    public void setVida(boolean vd){
        this.vida = vd;
        if(this.vida){
            this.setBackground(Color.GREEN);
        }else{
            this.setBackground(Color.BLACK);
        }
    }
    
}
