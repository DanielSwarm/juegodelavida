/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.InterfazJuegoDeLaVida;
import vista.PanelAmbiente;



/**
 *
 * @author daniel
 */
public class SeleccionNatural extends Thread{
    private boolean funcionando;
    public PanelAmbiente tablero;
    public InterfazJuegoDeLaVida ventana;
    public SeleccionNatural(InterfazJuegoDeLaVida v){
    ventana = v;
    funcionando = true;
    }
    public void setFuncionando(boolean modo){
        this.funcionando = modo;
    }
    public void esperar() throws InterruptedException{
        Thread.sleep (500);
    }
    @Override
	public void run() {
            do{
                if(this.funcionando==true){
                    //Ciclo del primer paso: Eliminando células
                    for (int i = 0; i < ventana.filas; i++) {
                        for (int j = 0; j < ventana.columnas; j++) {
                                //Verificando las células vivas
                                if(ventana.panelAmbiente.celulas[i][j].getVida()){
                                    if(!this.evaluacion(this.contadorCelulas(i,j))){
                                    ventana.panelAmbiente.matar(i, j);
                                    }
                                }
                        }
                    }
                    try {
                        this.esperar();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SeleccionNatural.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //Ciclo del segundo paso: Reviviendo células
                    for (int i = 0; i < ventana.filas; i++) {
                        for (int j = 0; j < ventana.columnas; j++) {
                                //Verificando las células muertas
                                if(!ventana.panelAmbiente.celulas[i][j].getVida()){
                                    if(this.contadorCelulas(i,j)==3){
                                    ventana.panelAmbiente.revivir(i, j);
                                    }
                                }
                        }
                    }
                    try {
                        this.esperar();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SeleccionNatural.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }while(true);
        }
    public int contadorCelulas(int i, int j){
        int contador = 0;
        if(i-1>=0 && j-1>=0){
            if(ventana.panelAmbiente.celulas[i-1][j-1].getVida()){
                contador++;
            }
        }
        if(i-1>=0){
            if(ventana.panelAmbiente.celulas[i-1][j].getVida()){
                contador++;
            }
        }
        if(i-1>=0 && j+1<=ventana.columnas-1){
            if(ventana.panelAmbiente.celulas[i-1][j+1].getVida()){
                contador++;
            }
        }
        if(j-1>=0){
            if(ventana.panelAmbiente.celulas[i][j-1].getVida()){
                contador++;
            }
        }
        if(j+1<=ventana.columnas-1){
            if(ventana.panelAmbiente.celulas[i][j+1].getVida()){
                contador++;
            }
        }
        if(i+1<=ventana.filas-1 && j-1>=0){
            if(ventana.panelAmbiente.celulas[i+1][j-1].getVida()){
                contador++;
            }
        }
        if(i+1<=ventana.filas-1){
            if(ventana.panelAmbiente.celulas[i+1][j].getVida()){
                contador++;
            }
        }
        if(i+1<=ventana.filas-1 && j+1<=ventana.columnas-1){
            if(ventana.panelAmbiente.celulas[i+1][j+1].getVida()){
                contador++;
            }
        }
        return contador;
    }
    public boolean evaluacion(int cont){
        if(cont<2 || cont>3){
            return false;
        }else{
           return true;
        }
    }
}
