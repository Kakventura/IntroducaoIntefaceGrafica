/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app_10_04;
import javax.swing.*;
import java.awt.*; // MUDANÇA DE FUNDO

/**
 *
 * @author  Karinne Angelo dos Santos Ventura
 */
public class Aplicativo extends JFrame {
    Aplicativo(){
        
        // NOME DO TÍTULO DA JANELA 
        super("Nossa primeira janela");
        
        // TAMANHO DA JANELA
        setSize(500, 200);
        
        // VISIBILIDADE DA JANELA
        setVisible(true); 
        
        //O USUÁRIO NÃO CONSEGUE REDIMENSIONAR O TAMANHO DA PÁGINA
        setResizable(false);
        
        // MAXIMIZAR JANELA
        //setExtendedState(MAXIMIZED_BOTH);
        
        // ABRE NA BARRA DE TAREFA MOSTRANDO O ICONE (MINIMIZADO)
        //setExtendedState(ICONIFIED);
        
        //CENTRALIZAÇÃO DA PAGINA NO MONITOR
        setLocationRelativeTo(null);
        
        // TROCAR A COR DE FUNDO DA JANELA (CARACTERISTICA DO JFRAME)
        // CONTAINER FAZ PARTE DA BIBLIOTECA AWT DO JFRAME
        Container tela = getContentPane(); // INSTANCIAMENTO DA CLASSE DENTRO DO JFRAME
        //CLASSE  OBJETO = PROPRIEDADES JFRAME
        //tela.setBackground(Color.ORANGE);
        // OBJETO CHAMANDO A FUNÇÃO BACKGROUND E ATRIBUINDO COR
        tela.setBackground(new Color(204,255,153));
        /* 
            tela.setBackground(new Color(255,128,128));
            ATRIBUINDO COR ATRAVÉS DO RGB
        */
        
        // COLOCAR O ÍCONE NA JANELA
        ImageIcon icone = new ImageIcon("R.gif");
        // INSTANCIAMENTO DA CLASSE E CRIAÇÃO DO OBJETO
        setIconImage(icone.getImage());
   }
 
}
