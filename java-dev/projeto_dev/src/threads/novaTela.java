package threads;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.InsetsUIResource;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class novaTela extends JDialog{

    private JPanel jPanel = new JPanel(new GridBagLayout());

    private JLabel descricaoHora = new JLabel("Nome");
    private JTextField mostradorpainel1 = new JTextField();

    private JLabel descricaopainel2 = new JLabel("Email");
    private JTextField mostradorpainel2 = new JTextField();

    private JButton botaoStart = new JButton("Start");
    private JButton botaoStop = new JButton("Stop");

    private JLabel statusThread = new JLabel("Status das Threads");
    private JTextField mostradorStatusThreads = new JTextField();
    
    private implementacaoFilaThread fila = new implementacaoFilaThread();

    public novaTela(){

        setLocationRelativeTo(null);
        setTitle("Telinha");
        setSize(new DimensionUIResource(240, 300));
        setResizable(false);

        GridBagConstraints gridBagConstraints = new GridBagConstraints(); //Controlador de posições
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new InsetsUIResource(5, 10, 5, 10);
        gridBagConstraints.anchor = gridBagConstraints.WEST;

        //                                                                      Thread Tempo
        statusThread.setPreferredSize(new DimensionUIResource(200, 25));
        gridBagConstraints.gridy ++;
        jPanel.add(statusThread, gridBagConstraints);

        mostradorStatusThreads.setPreferredSize(new DimensionUIResource(200, 25));
        mostradorStatusThreads.setEditable(false);
        gridBagConstraints.gridy ++;
        jPanel.add(mostradorStatusThreads, gridBagConstraints);

        //                                                                      Primeira thread
        descricaoHora.setPreferredSize(new DimensionUIResource(200,25));  
        gridBagConstraints.gridy ++;      
        jPanel.add(descricaoHora, gridBagConstraints);

        mostradorpainel1.setPreferredSize(new DimensionUIResource(200, 25));
        gridBagConstraints.gridy ++;
        jPanel.add(mostradorpainel1, gridBagConstraints);
        
        
        //                                                                      Segunda Thread
        descricaopainel2.setPreferredSize(new DimensionUIResource(200, 25));
        gridBagConstraints.gridy ++;
        jPanel.add(descricaopainel2, gridBagConstraints);

        mostradorpainel2.setPreferredSize(new DimensionUIResource(200, 25));

        gridBagConstraints.gridy ++;
        jPanel.add(mostradorpainel2, gridBagConstraints);


        //                                                                      Botão 1
        gridBagConstraints.gridy ++;
        gridBagConstraints.gridwidth = 1;
        botaoStart.setPreferredSize(new DimensionUIResource(90,25));         
        jPanel.add(botaoStart, gridBagConstraints);
         //                                                                      Botão 2
        botaoStop.setPreferredSize(new DimensionUIResource(90,25));         
        gridBagConstraints.gridx ++;
        jPanel.add(botaoStop, gridBagConstraints);

        botaoStart.addActionListener(new ActionListener(){
            
          
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fila == null){
                    fila = new implementacaoFilaThread();
                    fila.start();
                }else{
                    objetoFilaThread filaThread = new objetoFilaThread();
                    filaThread.setNome(mostradorpainel1.getText());
                    filaThread.setEmail(mostradorpainel2.getText());
                    fila.add(filaThread);
                    mostradorStatusThreads.setText("Rodando");
                }
            }

        });

        botaoStop.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                mostradorStatusThreads.setText("Parado");
                fila.stop();
                fila = null;
            }
        });

        fila.start();
        add(jPanel, BorderLayout.WEST);

        setVisible(true);                                                   //Sempre ultimo comando
    }
}