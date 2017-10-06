/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 *
 * @author daniel
 */
public class PanelOpciones extends JPanel implements ActionListener {
     //------------------------------------------------
    //	Constantes
    //------------------------------------------------
    public final static String INICIAR	= "iniciar";
    public final static String PARAR	= "parar";
    //------------------------------------------------
    //	Atributos
    //------------------------------------------------
    private JLabel labTotal;	
    private JTextField txtTotal;	
    private JButton butIniciar;	
    private JButton butParar;
    public InterfazJuegoDeLaVida ventana;
    public PanelOpciones(InterfazJuegoDeLaVida v)
    {
        this.ventana = v;
        // Asociación de un distribuidor gráfico y de las dimensiones	
        setLayout(new GridLayout(1, 3));
        setPreferredSize(new Dimension(	0, 50));
        // Definición del borde
        TitledBorder border = BorderFactory.createTitledBorder("Opciones");	
        border.setTitleColor(Color.BLUE);
        setBorder(border);	
        // Botón "Iniciar"
        butIniciar = new JButton("Iniciar");
        butIniciar.setActionCommand(INICIAR);
        butIniciar.addActionListener(this);
        // Botón "Parar"
        butParar = new JButton("Parar");	
        butParar.setActionCommand(PARAR);	
        butParar.addActionListener(this);
        // Adicionar todos los componentes gráficos al panel
        add(butIniciar);
        add(new	JLabel(""));	
        add(butParar);
    }
    
    
    //------------------------------------------------
    //	Método	de	atención	de	eventos
    //------------------------------------------------
    public void actionPerformed(ActionEvent evento)
    {
        // Identifica el evento que fue generado, pidiéndole su nombre	
        String comando = evento.getActionCommand( );
        //	Reacción al evento, dependiendo	del nombre del evento
        if(	comando.equals(INICIAR))
        {
                this.ventana.ComenzarJuego();
        }
        else if(comando.equals(PARAR))
        {
            this.ventana.TerminarJuego();
        }
    }
}
