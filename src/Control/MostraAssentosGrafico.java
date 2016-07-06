/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Programa��o Orientada a Objetos - Avan�ada
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Janeiro a Junho 
 * Aluno Decio Antonio de Carvalho  * 
 */
package Control;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author deciodecarvalho
 */
public class MostraAssentosGrafico extends JPanel{

  public void paintComponent(Graphics g){ 
    super.paintComponent(g);
    
    // Define a cor de fundo
    setBackground(Color.YELLOW);
    
    // Desenha um quadrado na cor azul
    g.setColor(Color.BLUE);
    g.fillRect(100, 100, 100, 100);
  }   
}
