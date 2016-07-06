/*
 * Este Software tem Objetivo Educacional
 * Para fins de aprendizagem e avaliacao na
 * Na Disciplina de Programa��o Orientada a Objetos - Avan�ada
 *  do Curso de Analise de Sistemas da Fatec - Ipiranga
 * Ano 2016 - Janeiro a Junho 
 * Aluno Decio Antonio de Carvalho  * 
 */
package Control;

/**
 *
 * @author deciodecarvalho
 */
/**
 * Escreva a descrição da classe SpinnerTeste aqui.
 *
 * @author (seu nome)
 * @version (número de versão ou data)
 */
/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/*
 * Based on SpinnerDemo, this application listens for
 * changes in a spinner's values.  Specifically, we listen
 * for when the third spinner changes and then change that
 * spinner's text color accordingly.
 * Other files required:
 *   AssentoUtilitario.java
 *   CicloSpAssento.java
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.net.URL;
import java.util.Calendar;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpringLayout;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EscolherAssento extends JPanel
        implements ChangeListener {

    protected Calendar calendar;
    protected JSpinner dateSpinner;

    protected Color SPRING_COLOR = new Color(0, 204, 51);
    protected Color SUMMER_COLOR = Color.RED;
    protected Color FALL_COLOR = new Color(255, 153, 0);
    protected Color WINTER_COLOR = Color.CYAN;

    public static URL url;

    protected static ImageIcon ii = new ImageIcon("/Icones/calendarioRed.png");

    public EscolherAssento(boolean ciclar) {
        super(new SpringLayout());

        String[] labels = {"Classe: ", "Fileira: ", "Coluna: ", "Status: "};
        int numPairs = labels.length;
        calendar = Calendar.getInstance();
        JFormattedTextField ftf = null;
        
        
        /**
         * Spinner 1 para o campo Classe de voo
         */
        //Add the Primeiro  label-spinner pair.
        String[] classe = getClasseStrings(); //get os nomes das classes
        SpinnerListModel classeModel = null;
        if (ciclar) { //use custom model
            classeModel = new CicloSpAssento(classe);
        } else { //use standard model
            classeModel = new SpinnerListModel(classe);
        }
        JSpinner spinnerClasse = addLabeledSpinner(this,
                labels[0],
                classeModel);
        //Tweak the spinner's formatted text field.
        ftf = getTextField(spinnerClasse);
        if (ftf != null) {
            ftf.setColumns(20); //specify more width than we need
            ftf.setHorizontalAlignment(JTextField.RIGHT);
            
            
        }
        //final Spinner 1

        /**
         * Spinner 2 para o campo Fileira
         */
        //Add the Segundo label-spinner pair.
        String[] fileiraStrings = getfileiraStrings(); //get month names
        SpinnerListModel fileiraModel = null;
        if (ciclar) { //use custom model
            fileiraModel = new CicloSpAssento(fileiraStrings);
        } else { //use standard model
            fileiraModel = new SpinnerListModel(fileiraStrings);
        }
        JSpinner spinner = addLabeledSpinner(this,
                labels[1],
                fileiraModel);
        //Tweak the spinner's formatted text field.
        ftf = getTextField(spinner);
        if (ftf != null) {
            ftf.setColumns(20); //specify more width than we need
            ftf.setHorizontalAlignment(JTextField.RIGHT);
        }
        //final Spinner 2

        /**
         * Spinner 3 para o campo Coluna
         */
        //Add second label-spinner pair.
        String[] colunaStrings = getcolunaStrings(); //get month names
        SpinnerListModel colunaModel = null;
        if (ciclar) { //use custom model
            colunaModel = new CicloSpAssento(colunaStrings);
        } else { //use standard model
            colunaModel = new SpinnerListModel(colunaStrings);
        }
        JSpinner spinnerColuna = addLabeledSpinner(this,
                labels[2],
                colunaModel);
        //Tweak the spinner's formatted text field.
        ftf = getTextField(spinnerColuna);
        if (ftf != null) {
            ftf.setColumns(20); //specify more width than we need
            ftf.setHorizontalAlignment(JTextField.RIGHT);
        }
        //final Spinner 3

        /**
         * Spinner 4 para o campo Classe de voo
         */
        //Add the Primeiro  label-spinner pair.
        String[] statusString = getStatusStrings(); //get os nomes das classes
        SpinnerListModel statusModel = null;
        if (ciclar) { //use custom model
            statusModel = new CicloSpAssento(statusString);
        } else { //use standard model
            statusModel = new SpinnerListModel(statusString);
        }
        JSpinner spinnerStatus = addLabeledSpinner(this,
                labels[3],
                statusModel);
        //Tweak the spinner's formatted text field.
        ftf = getTextField(spinnerStatus);
        if (ftf != null) {
            ftf.setForeground(FALL_COLOR);
            ftf.setColumns(20); //specify more width than we need
            ftf.setHorizontalAlignment(JTextField.RIGHT);
            
            if(ftf.getText()=="Ocupado"){
            ftf.setForeground(SUMMER_COLOR);
            }
            else if(ftf.getText()=="Livre"){
            ftf.setForeground(SPRING_COLOR);   
            }
            else{
              ftf.setForeground(FALL_COLOR);  
            }
                        
            ftf.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 3));
            spinnerStatus.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
        //final Spinner 4

        //Listen for changes on the date spinner.
        //spinnerStatus.addChangeListener(this);

        //Lay out the panel.
        AssentoUtilitario.makeCompactGrid(this,
                numPairs, 2, //rows, cols
                20, 20, //initX, initY
                20, 20);       //xPad, yPad

    }

    /**
     * Return the formatted text field used by the editor, or null if the editor
     * doesn't descend from JSpinner.DefaultEditor.
     */
    public JFormattedTextField getTextField(JSpinner spinner) {
        JComponent editor = spinner.getEditor();
        if (editor instanceof JSpinner.DefaultEditor) {
            return ((JSpinner.DefaultEditor) editor).getTextField();
        } else {
            System.err.println("Unexpected editor type: "
                    + spinner.getEditor().getClass()
                    + " isn't a descendant of DefaultEditor");
            return null;
        }
    }

    

    
   

    static protected JSpinner addLabeledSpinner(Container c,
            String label,
            SpinnerModel model) {
        JLabel l = new JLabel(label);
        c.add(l);

        JSpinner spinner = new JSpinner(model);
        l.setLabelFor(spinner);
        c.add(spinner);

        return spinner;
    }

    /**
     * Create the GUI and show it. For thread safety, this method should be
     * invoked from the event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Assentos Aeronave AeroFast");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Specify FlowLayout for the layout manager.
        frame.setLayout(new FlowLayout());
        JButton btnAssentoSeleciona = new JButton("Seleciona");
        JButton btnAssentoVoltar = new JButton("Voltar");
        JButton btnAssentoLimpar = new JButton("Limpar");
        
        
        //Add content to the window.
        frame.add(new EscolherAssento(true)); //funcao cicloSpAssento habilitada
        //frame.add(new EscolherAssento(false)); //funcao cicloApAssento desabilitada nao cicla opções
        
        frame.add(btnAssentoSeleciona);
        frame.add(btnAssentoVoltar);
        frame.add(btnAssentoLimpar);
        /**
         * 
         * JButton btnAssentoSeleciona = new JButton("Seleciona");
        JButton btnAssentoVoltar = new JButton("Voltar");
        JButton btnAssentoLimpar = new JButton("Limpar");
         */
        //Display the window.
        frame.pack();
        frame.setLocation(400, 400);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Turn off metal's use of bold fonts
                UIManager.put("swing.boldMetal", Boolean.FALSE);
                createAndShowGUI();
            }
        });
    }

    private String[] getClasseStrings() {
        String[] classe = {"Classe Economica", "Classe Empresarial", "Primeira Classe"};
        int lastIndex = classe.length - 1;

        if (classe[lastIndex] == null
                || classe[lastIndex].length() <= 0) { //last item empty
            String[] classeStrings = new String[lastIndex];
            System.arraycopy(classe, 0,
                    classeStrings, 0, lastIndex);
            return classeStrings;
        } else { //last item not empty
            return classe;
        }

    }

    private String[] getfileiraStrings() {
        String[] fileira = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "L",
            "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        int lastIndex = fileira.length - 1;

        if (fileira[lastIndex] == null
                || fileira[lastIndex].length() <= 0) { //last item empty
            String[] fileiraStrings = new String[lastIndex];
            System.arraycopy(fileira, 0,
                    fileiraStrings, 0, lastIndex);
            return fileiraStrings;
        } else { //last item not empty
            return fileira;
        }
    }

    private String[] getcolunaStrings() {
        String[] coluna = {"A1", "B1", "C1", "D1", "E1", "F1", "G1", "H1", "I1", "J1", "L1",
            "M1", "N1", "O1", "P1", "Q1", "R1", "S1", "T1", "U1", "V1", "W1", "X1", "Y1", "Z1"};

        int lastIndex = coluna.length - 1;

        if (coluna[lastIndex] == null
                || coluna[lastIndex].length() <= 0) { //last item empty
            String[] colunaStrings = new String[lastIndex];
            System.arraycopy(coluna, 0,
                    colunaStrings, 0, lastIndex);
            return colunaStrings;
        } else { //last item not empty
            return coluna;
        }
    }

    private String[] getStatusStrings() {
        String[] status = {"Ocupado", "Livre", "Reservado"};
        int lastIndex = status.length - 1;

        if (status[lastIndex] == null
                || status[lastIndex].length() <= 0) { //last item empty
            String[] statusStrings = new String[lastIndex];
            System.arraycopy(status, 0,
                    statusStrings, 0, lastIndex);
            return statusStrings;
        } else { //last item not empty
            return status;
        }
    }

/**
 * JButton jbtnAlpha = new JButton("Alpha");
JButton jbtnBeta = new JButton("Beta");
// Add action listener for Alpha.
jbtnAlpha.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
jlab.setText("Alpha was pressed.");
}
});
* 
* 
*  
 * @param e 
 */
    
    
    @Override
    public void stateChanged(ChangeEvent e) {
        
    }
    
     protected String setColorStringForeground(String txt){
         String cor = "Black";
           if(null != txt)switch (txt) {
            case "Ocupado":
                cor = "SUMMER_COLOR";
                break;
            case "Livre":
                cor = "SPRING_COLOR";
                break;
            default:
                cor = "FALL_COLOR";
                break;
        }
            return cor;
    } 

}
