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

public class TelaTimeThread extends JDialog{

    private JPanel jPanel = new JPanel(new GridBagLayout());

    private JLabel descricaoHora = new JLabel("data");
    private JTextField mostraTempo = new JTextField();

    private JLabel descricaopainel2 = new JLabel("status Emails");
    private JTextField mostradorpainel2 = new JTextField();

    private JLabel descricaopainel3 = new JLabel("Status Nfs");
    private JTextField mostradorpainel3 = new JTextField();

    private JButton botaoStart = new JButton("Start");
    private JButton botaoStop = new JButton("Stop");

    private JLabel statusThread = new JLabel("Status das Threads");
    private JTextField mostradorStatusThreads = new JTextField();

    private Runnable thread1 = new Runnable(){
        public void run(){
            while(true){
                mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
                         //Poderia ser feito assim tambem
                //mostraTempo2.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
                        //Com as duas na mesma thread 
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    
    private Runnable thread2 = new Runnable(){
        
        public void run(){
            for (int pos = 1; pos <= 10; pos++ ){
                mostradorpainel2.setText("Enviado Email: " + pos);
                try {
                    Thread.sleep(1_000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            mostradorpainel2.setText("Emails Enviados");
            }
    };

    private  Runnable thread3 = new Runnable(){

        public void run(){
            for (int pos = 1; pos <= 10; pos++ ){
                mostradorpainel3.setText("Nota enviada: " + pos);
                try { 
                    Thread.sleep(1_000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
           mostradorpainel3.setText("Notas Enviadas");
        }
        
    };

    private Thread thrad1Status;
    private Thread thrad2Email;
    private Thread thread3NF;

    public TelaTimeThread(){

        setLocationRelativeTo(null);
        setTitle("Telinha");
        setSize(new DimensionUIResource(240, 440));
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

        mostraTempo.setPreferredSize(new DimensionUIResource(200, 25));
        mostraTempo.setEditable(false);
        gridBagConstraints.gridy ++;
        jPanel.add(mostraTempo, gridBagConstraints);
        
        
        //                                                                      Segunda Thread
        descricaopainel2.setPreferredSize(new DimensionUIResource(200, 25));
        gridBagConstraints.gridy ++;
        jPanel.add(descricaopainel2, gridBagConstraints);

        mostradorpainel2.setPreferredSize(new DimensionUIResource(200, 25));
        mostradorpainel2.setEditable(false);
        gridBagConstraints.gridy ++;
        jPanel.add(mostradorpainel2, gridBagConstraints);

        //                                                                      Teceira Thread
        descricaopainel3.setPreferredSize(new DimensionUIResource(200, 25));
        gridBagConstraints.gridy ++;
        jPanel.add(descricaopainel3, gridBagConstraints);

        mostradorpainel3.setPreferredSize(new DimensionUIResource(200, 25));
        mostradorpainel3.setEditable(false);
        gridBagConstraints.gridy ++;
        jPanel.add(mostradorpainel3, gridBagConstraints);


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
                thrad1Status = new Thread(thread1);
                thrad2Email = new Thread(thread2);
                thread3NF = new Thread(thread3);
                thrad1Status.start();
                thrad2Email.start();
                thread3NF.start();

                botaoStart.setEnabled(false);
                botaoStop.setEnabled(true);
                mostradorStatusThreads.setText("Rodando");
            }

        });

        botaoStop.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                thrad1Status.stop();
                thrad2Email.stop();
                thread3NF.stop();

                botaoStart.setEnabled(true);
                botaoStop.setEnabled(false);
                mostradorStatusThreads.setText("Parado");
            }
        });

        botaoStop.setEnabled(false);
        add(jPanel, BorderLayout.WEST);

        setVisible(true);                                                   //Sempre ultimo comando
    }
}